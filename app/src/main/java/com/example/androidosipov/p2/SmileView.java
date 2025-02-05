package com.example.androidosipov.p2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;

public class SmileView extends SurfaceView implements SurfaceHolder.Callback {
    SmileThread smileThread;

    public SmileView(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        smileThread = new SmileThread(getHolder(), getContext());
        smileThread.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        smileThread.running = false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        smileThread.setTargetX((int) event.getX());
        smileThread.setTargetY((int) event.getY());
        return super.onTouchEvent(event);
    }
}
