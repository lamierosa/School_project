package com.example.androidosipov.p2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.List;

public class Sprite {
    private Bitmap bitmap;
    private int x, y;
    private int velocityX, velocityY;
    private int padding = 60;

    private List<Rect> frames;
    private int frameWidth;
    private int frameHeight;
    private int currentFrame;
    private int frameTime = 100;
    private int timeForCurrentFrame = 0;

    public Sprite(int x, int y, int vx,int vy,Rect start, Bitmap b){
        this.x = x;
        this.y = y;
        this.velocityX = vx;
        this.velocityY = vy;
        frames = new ArrayList<Rect>();
        frames.add(start);
        frameWidth = frameHeight = 300;
        bitmap = b;
    }

    public void draw(Canvas canvas){
        Rect r1 = frames.get(currentFrame);
        Rect r2 = new Rect(x,y,x+frameWidth,y+frameHeight);

        canvas.drawBitmap(bitmap,r1,r2, new Paint());
    }

    public void update(long l) {
        timeForCurrentFrame += l;
        if(timeForCurrentFrame >= frameTime){
            currentFrame = (currentFrame + 1) % frames.size();
            timeForCurrentFrame -= frameTime;
        }
        x += velocityX  * (l / 1000.0);
        y += velocityY  * (l / 1000.0);
    }

    public Rect getBox() {
        return new Rect(x + padding, y + padding, x - 2 * padding + frameWidth, y - padding + frameHeight);
    }

    public boolean intersect(Sprite enemy) {
        return this.getBox().intersect(enemy.getBox());
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(int velocityX) {
        this.velocityX = velocityX;
    }

    public int getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(int velocityY) {
        this.velocityY = velocityY;
    }

    public List<Rect> getFrames() {
        return frames;
    }

    public void setFrames(List<Rect> frames) {
        this.frames = frames;
    }

    public int getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(int frameWidth) {
        this.frameWidth = frameWidth;
    }

    public int getFrameHeight() {
        return frameHeight;
    }

    public void setFrameHeight(int frameHeight) {
        this.frameHeight = frameHeight;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public int getFrameTime() {
        return frameTime;
    }

    public void setFrameTime(int frameTime) {
        this.frameTime = frameTime;
    }

    public int getTimeForCurrentFrame() {
        return timeForCurrentFrame;
    }

    public void setTimeForCurrentFrame(int timeForCurrentFrame) {
        this.timeForCurrentFrame = timeForCurrentFrame;
    }

}
