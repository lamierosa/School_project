package com.example.androidosipov;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {
    EditText nameET2;
    Button button4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button4 = findViewById(R.id.button4);
        nameET2 = findViewById(R.id.nameET2);

    View.OnClickListener l  = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent i = new Intent();
            i.putExtra("Name", nameET2.getText().toString());
            setResult(RESULT_OK, i);
            finish();
        }
    };
    button4.setOnClickListener(l);
    }

}