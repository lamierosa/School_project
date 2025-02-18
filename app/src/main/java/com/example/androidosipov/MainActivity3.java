package com.example.androidosipov;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {
    TextView tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tv= (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("username");
        tv.setText("Hello "+name+"!");
    }
}