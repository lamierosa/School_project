package com.example.androidosipov.p2;

import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.androidosipov.R;

public class ThreadActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
//        MyThread myThread = new MyThread();
//        myThread.start();
        Thread thread = new Thread( new ScreenChanger());
        thread.start();
        textView = findViewById(R.id.textView5);
        Toast.makeText(this, "Wake Up", Toast.LENGTH_SHORT).show();
    }

    class ScreenChanger implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                runOnUiThread(() -> textView.append("a"));
            }
        }
    }
}