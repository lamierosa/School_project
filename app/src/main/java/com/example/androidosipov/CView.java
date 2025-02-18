package com.example.androidosipov;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class CView extends View {
    int[] x = new int[14];
    int[] y = new int[14];
    public CView(Context context) {
        super(context);
        x = fillRandom(15, 800);
        y = fillRandom(15, 1600);
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 800);
            y[i] = (int) (Math.random() * 1600);
        }
    }
    @Override
    protected void onDraw( Canvas canvas) {
        for (int i = 0; i < x.length; i++) {
            canvas.drawCircle(x[i], y[i], 50, new Paint());
            x[i]+=i;
            y[i]+=i;
        }
        invalidate();
    }

    public static int[] fillRandom(int l, int max) {
        int[] r = new int[l];
        for (int i = 0; i < l; i++) {
            r[i] = (int)(Math.random()*max);
        }
        return r;
    }
}