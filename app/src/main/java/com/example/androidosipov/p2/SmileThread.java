package com.example.androidosipov.p2;

import android.content.Context;
import android.graphics.*;
import android.view.SurfaceHolder;
import com.example.androidosipov.R;

public class SmileThread extends Thread {
    SurfaceHolder holder;
    Context context;
    boolean running = true;
    Bitmap smilelol;
    int smileX, smileY, targetX, targetY;
    Paint paint = new Paint();
    private int w;
    private int h;


    public SmileThread(SurfaceHolder holder, Context context) {
        this.holder = holder;
        this.context = context;
        smilelol = BitmapFactory.decodeResource(context.getResources(), R.drawable.smilelol);
    }

    public void run() {
        while (running) {
            Canvas canvas = holder.lockCanvas();

            if (holder != null) {
                try {
                    canvas.drawColor(Color.BLUE);
                    paint.setColor(Color.WHITE);
                    canvas.drawCircle(targetX, targetY, 50, paint);
                    Rect r1 = new Rect(0, 0, smilelol.getWidth(), smilelol.getHeight());
                    w = 700;
                    h = 500;
                    Rect r2 = new Rect(smileX, smileY, w + smileX, h + smileY);
                    canvas.drawBitmap(smilelol, r1, r2, null);


                    int minx = Math.min(Math.abs(targetX - smileX+(w/2)), 5);
                    if (targetX > smileX +(w/2)) {
                        smileX += minx;
                    } else if (targetX < smileX + (w/2)) {
                        smileX -= minx;
                    }

                    int miny = Math.min(Math.abs(targetY - smileY -(h/2)), 5);
                    if (targetY > smileY +(h/2)) {
                        smileY += miny;
                    } else if (targetY < smileY + (h/2)) {
                        smileY -= miny;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    holder.unlockCanvasAndPost(canvas);
                }
            }
        }

    }

    public int getTargetY() {
        return targetY;
    }

    public void setTargetY(int targetY) {
        this.targetY = targetY;
    }

    public int getTargetX() {
        return targetX;
    }

    public void setTargetX(int targetX) {
        this.targetX = targetX;
    }

    public int getSmileY() {
        return smileY;
    }

    public void setSmileY(int smileY) {
        this.smileY = smileY;
    }

    public int getSmileX() {
        return smileX;
    }

    public void setSmileX(int smileX) {
        this.smileX = smileX;
    }
}
