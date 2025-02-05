package com.example.androidosipov;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final int REQ_C = 1;
    Button button;
    Button button2;
    Button button3;
    EditText nameET;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        nameET = findViewById(R.id.nameET2);
        button2 = findViewById(R.id.button2);
        tv = findViewById(R.id.tv);
        button3 = findViewById(R.id.button3);


        View.OnClickListener listener  = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        };
        button.setOnClickListener(listener);

        View.OnClickListener l2 = (view) -> {
            Intent i2 = new Intent(getBaseContext(), MainActivity3.class);
            String s = nameET.getText().toString();
            i2.putExtra("username", s);
            startActivity(i2);
        };
        button2.setOnClickListener(l2);

        View.OnClickListener l3  = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this, MainActivity4.class);
                startActivityForResult(i2, REQ_C);
            }
        };
        button3.setOnClickListener(l3);

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode) {
            case RESULT_OK:
                tv.setText(data.getStringExtra("Name"));
                break;
        }
    }
}