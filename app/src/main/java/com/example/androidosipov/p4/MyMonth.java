package com.example.androidosipov.p4;

public class MyMonth {
    private String m;
    private double t;
    int d;
    boolean l;

    public MyMonth(double t, int d, String m) {
        this.t = t;
        this.d = d;
        this.m = m;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public boolean isL() {
        return l;
    }

    public void setL(boolean l) {
        this.l = l;
    }
}
