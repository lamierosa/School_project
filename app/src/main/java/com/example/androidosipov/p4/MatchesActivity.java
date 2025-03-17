package com.example.androidosipov.p4;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.androidosipov.R;

import java.util.ArrayList;

public class MatchesActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matches);
        lv = findViewById(R.id.lv);
        DBMatches db = new DBMatches(this);
        ArrayList<Match> list = db.selectAll();
        ArrayAdapter<Match> a = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);
        lv.setAdapter(a);
    }
}