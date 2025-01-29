package com.example.androidosipov.p2;

import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.androidosipov.R;

public class MsgFragment extends Fragment {
    TextView msgTV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_msg, container, false);
        msgTV = v.findViewById(R.id.msgTV);
        return v;
    }

    public void setMsg(String msg){
        msgTV.setText(msg);
    }
}