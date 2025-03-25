package com.example.androidosipov.p4;

import java.util.LinkedList;

public class L48 {
    public static void sort(int[] a, int low, int high) {
        if (a.length == 0) return;
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        int op = a[mid];
        int i = low, j = high;
        while (i <= j) {
            while (a[i] < op) {
                i++;
            }
            while (a[j] > op) {
                j--;
            }
            if (i <= j) {
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                i++;
                j--;
            }
        }
        if (low < j) sort(a, low, j);
        if (i < high) sort(a, i, high);
    }

    public static void main(String[] args) {
        LinkedList<MyMonth> list = new LinkedList<>();
        list.add(new MyMonth(-15, 31, "Jan"));
        list.add(new MyMonth(-20, 28, "Feb"));
        list.add(new MyMonth(-5, 31, "Mar"));
        list.add(new MyMonth(+5, 30, "Apr"));
        list.add(new MyMonth(+20, 31, "May"));
        list.add(new MyMonth(+25, 30, "Jun"));
        list.add(new MyMonth(+20, 31, "Jul"));
        list.add(new MyMonth(+15, 31, "Aug"));

        list.sort(new MyMonth.MonthDayComparator());
        System.out.println(list.toString());

        list.sort(new MyMonth.MonthTempComparator());
        System.out.println(list.toString());


    }
}
