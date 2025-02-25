package com.example.androidosipov.p4;

import java.util.ArrayList;

public class Lesson4_2 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList();
        l.add(1);
        l.add(12);
        l.add(123);
        l.add(1234);
        l.add(12345);
        l.add(123456);
        l.add(1234567);
        l.add(12345678);
        l.add(123456789);
        l.add(0);
        l.add(2);
        Integer item = (Integer) l.get(5);
        System.out.println(item);
        System.out.println(l.get(0));
        System.out.println(l.get(10));
        Integer[] arr = new Integer[10];
        for(Integer next: arr) {
            System.out.println(next);
        }
        l.remove(0);
        for (Integer next: l) {
            System.out.print(next + " ");
        }
        System.out.println(l.size());
    }
}
