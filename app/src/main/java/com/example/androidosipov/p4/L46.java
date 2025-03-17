package com.example.androidosipov.p4;

import java.util.Scanner;

public class L46 {
    public static double pow(int x, int n)
    {
        if (n < 0) return 1./ pow(x, -n);
        if (n == 0) return 1;
        double result = x * pow(x, n-1);
        return result;
    }
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = fib(n-1) + fib(n-2);
        return result;
    }
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int x = 2;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        System.out.println("Result: " + result);
        System.out.println(pow(x, -n));
    }
}
