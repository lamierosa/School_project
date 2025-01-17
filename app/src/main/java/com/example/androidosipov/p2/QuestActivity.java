package com.example.androidosipov.p2;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.androidosipov.R;

public class QuestActivity extends AppCompatActivity {
    TextView hpTV, sanTV, coinsTV;
    TextView answersTV;
    LinearLayout buttonsLL;
    Story story;
    Situation start;
    Button exitBtn;
    Button resBtn;
    Character hatgirl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);

        answersTV = findViewById(R.id.answersTV);
        buttonsLL = findViewById(R.id.buttonsLL);

        hpTV = findViewById(R.id.hpTV);
        sanTV = findViewById(R.id.sanTV);
        coinsTV = findViewById(R.id.coinsTV);

        hatgirl = new Character("Красная шапочка", 100, 100, 25);
        start = Game_novel.windowsStory();
        story = new Story(start, hatgirl);
        changeSituationOnScreen();

        exitBtn = findViewById(R.id.exitBtn);
        View.OnClickListener l1 = new MyListener();
        exitBtn.setOnClickListener(l1);

        resBtn = findViewById(R.id.resBtn);
        View.OnClickListener l2 = new RestartListener();
        resBtn.setOnClickListener(l2);


    }

    public void changeSituationOnScreen() {
        buttonsLL.removeAllViews();
        hpTV.setText(hatgirl.getHp() + "");
        sanTV.setText(hatgirl.getSan() + "");
        coinsTV.setText(hatgirl.getCoins() + " ");
        Situation situation = story.getCurrent();
        answersTV.setText(situation.getName());
        for (int i = 0; i < situation.answers.length; i++) {
            Button button = new Button(getBaseContext());
            button.setText((i + 1) + " ");
            buttonsLL.addView(button);
            final int answer = i + 1;
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    story.go(answer);
                    changeSituationOnScreen();
                }
            });
        }
    }

    public class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            finish();
        }
    }

    public class RestartListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            story.setCurrent(start);
            hatgirl.setHp(100);
            hatgirl.setCoins(25);
            hatgirl.setSan(100);
            changeSituationOnScreen();
        }
    }
}