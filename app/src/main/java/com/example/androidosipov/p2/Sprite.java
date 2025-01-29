package com.example.androidosipov.p2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.List;

public class Sprite {
    Bitmap bitmap;
    int x, y;
    int velocityX, velocityY;

    List<Rect> frames;
    int frameWidth;
    int frameHeight;
    int currentFrame;
    int frameTime = 100;
    int timeForCurrentFrame = 0;

    public Sprite(int x, int y, int vx,int vy,Rect start, Bitmap b){
        this.x = x;
        this.y = y;
        this.velocityX = vx;
        this.velocityY = vy;
        frames = new ArrayList<Rect>();
        frames.add(start);
        frameWidth = frameHeight = 100;
        bitmap = b;
    }

    public void draw(Canvas canvas){
        Rect r1 = frames.get(currentFrame);
        Rect r2 = new Rect(x,y,x+frameWidth,y+frameHeight);

        canvas.drawBitmap(bitmap,r1,r2, new Paint());
    }
}
