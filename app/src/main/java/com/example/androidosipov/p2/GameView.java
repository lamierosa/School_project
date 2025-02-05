package com.example.androidosipov.p2;

import android.content.Context;
import android.graphics.*;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.example.androidosipov.R;

public class GameView extends View {
    Sprite player;
    Sprite enemy;
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
        Bitmap b2 = BitmapFactory.decodeResource(getResources(), R.drawable.enemy);
        int a = b.getWidth() / 5;
        int c = b.getHeight() / 3;
        Rect start = new Rect(0, 0, a, c);
        player = new Sprite(50,50,0,500,start,b);
        enemy = new Sprite(-100,-100,-500,0,start,b2);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 0) || (i == 4 && j == 2)) {
                    continue;
                }
               Rect rect = new Rect(i*a, j*c, (i+1)*a, (j+1)*c);
               player.getFrames().add(rect);
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == 2)) {
                    continue;
                }
               Rect rect = new Rect(i*a, j*c, (i+1)*a, (j+1)*c);
               enemy.getFrames().add(rect);
            }
        }
        Timer timer = new Timer();
        timer.start();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        player.setVelocityY(player.getVelocityY()*-1);
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.parseColor("#D9D9D9"));
        p.setTextSize(50);
        p.setColor(Color.BLACK);
        canvas.drawText(points + "", w*0.9f, 100, p);
        player.draw(canvas);
        if (enemy.getX() == -100) {
            enemy.setX(w);
        }
        enemy.draw(canvas);
    }

    class Timer extends CountDownTimer {
        public long pl = Long.MAX_VALUE;

        public Timer() {
            super(Long.MAX_VALUE, 30);
        }

        @Override
        public void onTick(long l) {
            player.update(pl-l);
            enemy.update(pl-l);
            boolean flag = enemy.intersect(player);
            if (flag || enemy.getX() < -300) {
                enemy.setX(w + enemy.getFrames().get(0).right);
                enemy.setY((int) (Math.random() * (h - enemy.getFrameWidth())));
                if (flag) {
                    points -= 100;
                }
            } else {
                points += 1;
            }
            if ((player.getY() < 0) || player.getY() > h - player.getFrameWidth()) {
                player.setVelocityY(player.getVelocityY()*-1);
            }
            enemy.setVelocityX(-500 * (1 + points/1000));
            pl = l;
            invalidate();
        }

        @Override
        public void onFinish() {
            this.start();
        }
    }
}
