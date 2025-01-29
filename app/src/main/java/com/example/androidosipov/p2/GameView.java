package com.example.androidosipov.p2;

import android.content.Context;
import android.graphics.*;
import android.view.View;
import androidx.annotation.NonNull;
import com.example.androidosipov.R;

public class GameView extends View {
    Sprite player;
    int points;
    int w;
    int h;
    Paint p = new Paint();

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.w = w;
        this.h = h;
    }

    public GameView(Context context) {
        super(context);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.player);
        Rect start = new Rect(0, 0, b.getWidth()/5, b.getHeight()/3);
        player = new Sprite(50,50,0,0,start,b);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#D9D9D9"));
        p.setTextSize(50);
        p.setColor(Color.BLACK);
        canvas.drawText(points + "", w*0.9f, 100, p);
        player.draw(canvas);
    }
}
