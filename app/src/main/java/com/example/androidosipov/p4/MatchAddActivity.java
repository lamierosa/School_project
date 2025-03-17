package com.example.androidosipov.p4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.androidosipov.R;

public class MatchAddActivity extends AppCompatActivity implements View.OnClickListener {

    DBMatches dbMatches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_add);
        dbMatches = new DBMatches(this);
        Button b = new Button(this);
        b.setText("Add Match");
        b.setOnClickListener(this);
        addContentView(b, new ViewGroup.LayoutParams(500,200));
    }

    @Override
    public void onClick(View view) {
        String t1 = "Zenit"; //et1.getText().toString();
        String t2 = "Rubin";
        int p1 = 2;
        int p2 = 3;
        Match m = new Match(t1, t2, p1, p2);
        dbMatches.insert(m);
    }
}