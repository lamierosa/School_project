package com.example.androidosipov;

import android.graphics.Color;

class ColorRect extends Rect {
    public ColorRect(int i, int width, int red) {
        super(i,width);
      color = Color.valueOf(red);
    }


    public static void main(String[] args) {
        ColorRect p = new ColorRect(500, 300, Color.RED);
    }
    Color color;

    ColorRect(int i, double width, double height) {
        super(width, height);
    }
}