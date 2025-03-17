package com.example.androidosipov.p4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.androidosipov.R;

public class RecursionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new RecursionDraw(this));
    }

    private class RecursionDraw extends View {
        public RecursionDraw(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(@NonNull Canvas canvas) {
            super.onDraw(canvas);
            drawCircle(canvas, getWidth()/3, getWidth()/2, getHeight()/2);
        }

        public void drawCircle(Canvas canvas, int r, int x, int y){
            if (r < 50) return;
            Paint paint = new Paint();
            canvas.drawCircle(x, y, r, paint);
            drawCircle(canvas,r/2, x -r/2, y);
            drawCircle(canvas,r/2, x +r, y);
            drawCircle(canvas,r/2, x, y-r);
            drawCircle(canvas,r/2, x, y+r);
        }
    }
}