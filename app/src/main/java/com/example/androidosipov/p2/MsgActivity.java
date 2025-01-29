package com.example.androidosipov.p2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.example.androidosipov.R;

public class MsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        String msg = intent.getStringExtra("text");
        FragmentManager fm = getSupportFragmentManager();
        MsgFragment msgFragment = (MsgFragment) fm.findFragmentById(R.id.fragmentContainerView2);
        msgFragment.setMsg(msg);
    }
}