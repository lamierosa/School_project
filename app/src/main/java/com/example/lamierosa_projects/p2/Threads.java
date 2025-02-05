package com.example.androidosipov.p2;

public class Threads extends Thread {
    String name;
    public Threads(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.print(name);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        Threads a = new Threads("A");
        Threads b = new Threads("B");
        Threads c = new Threads("C");
        a.start();
        b.start();
        c.start();
        System.out.println("Main thread finished");
    }
}
