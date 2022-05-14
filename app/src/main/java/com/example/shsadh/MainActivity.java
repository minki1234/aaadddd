package com.example.shsadh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    Button button1;
    TextView text1;
    String m_id = "ffff";
    String m_pass = "5678";
    String input1 = "",  input2 = "";
    ImageView logo1;
    int logo_flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         edit1 = findViewById(R.id.edit1);
         edit2 = findViewById(R.id.edit2);
         button1 = findViewById(R.id.Button1);
         text1 = findViewById(R.id.text1);
         logo1 = findViewById(R.id.logo1);


         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 input1 = edit1.getText().toString();
                 input2 = edit2.getText().toString();
                 if(input1.equals(m_id) && input2.equals(m_pass)) {
                    //
                     Intent intent = new Intent(MainActivity.this, MenuActivity2.class);
                     intent.putExtra("myId", m_id);
                     startActivity(intent);
                     text1.setText("로그인");
                 }else{

                     text1.setText("실패");


                 }
             }
         });

          logo1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  changeImage(logo_flag);
              }
          });

    }

    void changeImage(int flag){
        logo_flag++;
        if(logo_flag > 3){
            logo_flag = 0;
        }

         if(logo_flag == 0){
             logo1.setImageResource(R.drawable.logo);
         }else if(logo_flag == 1){
             logo1.setImageResource(R.drawable.hhh);
         }else if(logo_flag == 2){
             logo1.setImageResource(R.drawable.ooo);
         }else if(logo_flag == 3){
             logo1.setImageResource(R.drawable.nono);
         }

    }
}