package com.example.androidosipov.p2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.androidosipov.R;

public class SmileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SmileView(this));

    }
}