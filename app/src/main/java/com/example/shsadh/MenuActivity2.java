package com.example.shsadh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity2 extends AppCompatActivity {
 TextView menu_text1;
 String id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        menu_text1 = findViewById(R.id.menu_text1);

        getData();
    }

    void getData(){

        id = getIntent().getStringExtra("myId");
        menu_text1.setText(id);
    }
}