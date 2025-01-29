package com.example.androidosipov.p2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.androidosipov.R;

public class InputFragment extends Fragment implements View.OnClickListener {

    EditText msgET;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_input_fragment, container, false);
        msgET = v.findViewById(R.id.msgET);
        btn1 = v.findViewById(R.id.btn1);
        btn2 = v.findViewById(R.id.btn2);
        btn3 = v.findViewById(R.id.btn3);
        btn4 = v.findViewById(R.id.btn4);
        btn5 = v.findViewById(R.id.btn5);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View view) {
        String msg = msgET.getText().toString();
        MsgFragment mf = (MsgFragment) getChildFragmentManager().findFragmentById(R.id.fragmentContainerView3);
        if (mf != null) {
            mf.setMsg(msg);
        } else {
            Intent i = new Intent(getActivity(), MsgActivity.class);
            i.putExtra("text", msg);
            startActivity(i);
        }
    }
}