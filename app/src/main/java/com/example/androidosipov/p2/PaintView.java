package com.example.androidosipov.p2;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.example.androidosipov.R;

public class PaintView extends View {
    Paint p = new Paint();
    public PaintView(Context context) {
        super(context);
    }

    public PaintView(Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        p.setTextSize(50);
        canvas.drawText("Lol lol lol lol lol",500,500, p);
        int angle = 45;
        canvas.save();
        canvas.rotate(angle,500,500);
        p.setColor(Color.rgb(45,200,150));
        canvas.drawRect(500,500,600,600, p);
        canvas.restore();
        Rect rect = new Rect(50, 500, 250, 700);
        p.setColor(Color.GREEN);
        canvas.drawRect(rect, p);
        Bitmap img = BitmapFactory.decodeResource(getResources(), R.drawable.img);
        canvas.drawBitmap(img,600,500,p);
        Rect r1 = new Rect(0, 0, img.getWidth()/2, img.getHeight()/2);
        Rect r2 = new Rect(300, 900, 500, 1100);
        canvas.drawBitmap(img,r1,r2,p);

    }
}
