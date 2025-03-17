package com.example.androidosipov.p4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.androidosipov.R;

import java.util.ArrayList;

public class MyMonthAdapter extends ArrayAdapter<MyMonth> {
    public MyMonthAdapter(@NonNull Context context, ArrayList<MyMonth> list) {
        super(context, R.layout.month_item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.month_item, null);
        }
        MyMonth month = getItem(position);

        TextView mTv = convertView.findViewById(R.id.mTv);
        mTv.setText(month.getM());
        TextView dTv = convertView.findViewById(R.id.dTv);
        dTv.setText(month.getD());
        TextView tTv = convertView.findViewById(R.id.tTv);
        tTv.setText((int) month.getT());

        return convertView;
    }
}
