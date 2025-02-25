package com.example.androidosipov.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Lesson4_3 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.remove(0);
        l.add(2);
        l.add(3);
        l.add(4);
        LinkedList<Integer> l2 = (LinkedList<Integer>) l.clone();
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(3,15);

        Integer item = (Integer) l.get(5);
        for (Integer next : l2) {
            System.out.println(next);
        }

        System.out.println("2 - " + (l.contains(2) ? "yes" : "no"));

        item = (Integer) l.poll();
        item = item + item;
        System.out.println(item);

        Integer[] fromList = new Integer[5];
        fromList = l.toArray(fromList);
        System.out.println(Arrays.toString(fromList));

    }
}
