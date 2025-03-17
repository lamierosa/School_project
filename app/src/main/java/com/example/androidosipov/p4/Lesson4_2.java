package com.example.androidosipov.p4;

import java.util.ArrayList;
import java.util.LinkedList;

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

        LinkedList<MyNode<String>> nodes = new LinkedList<>();

        nodes.add(new MyNode<>("string"));
        LinkedList<MyNode<String>> nodes2 = (LinkedList<MyNode<String>>) nodes.clone();
        System.out.println(nodes.peekFirst());
        nodes.get(0).setValue("string2");
        System.out.println(nodes2.peekFirst());


    }
}
