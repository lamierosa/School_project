package com.example.androidosipov.p4;

import java.util.Comparator;

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

    public static class MonthDayComparator implements Comparator<MyMonth> {

        @Override
        public int compare(MyMonth t1, MyMonth t2) {
            return t1.d - t2.d;
        }
    }
    public static class MonthTempComparator implements Comparator<MyMonth> {

        @Override
        public int compare(MyMonth t1, MyMonth t2) {
            return (int) t1.t - (int)t2.t;
        }
    }

    public String toString() {
        return m + ":" + d + ":" + t;
    }
}
