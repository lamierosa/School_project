package com.example.androidosipov.p3;

import java.util.Arrays;

public class Lessson4_1 {
    public static void main(String[] args) {
        String[] a = {"111", "12", "3", "47", "5", "6", "7", "8", "9", "10"};
        Integer[] a2 = {111, 12, 3, 47, 5, 6, 78, 8, 9, 10};
        String[] b = new String[10];
        Arrays.fill(b, "a");
        System.arraycopy(a, 3, b, 7, 3);
        System.out.println(Arrays.equals(a,b));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a2, new LastDigitComparator());
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a2, 0, 9);
        System.out.println(Arrays.toString(a2));

    }
}
