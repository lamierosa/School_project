package com.example.androidosipov.p2;

public class MyHouse {
    private boolean pizzaArrived = false;


    public synchronized void eatPizza() {
            while (!pizzaArrived) {
                try {
                    System.out.println("Waiting");
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            System.out.println("yum yum");

    }

    public synchronized void pizzaGuy () {
            pizzaArrived = true;
            notifyAll();
    }


    public static void main(String[] args) {

        MyHouse myHouse = new MyHouse();

        Thread hungryFamily = new Thread(()->{
            myHouse.eatPizza();
        });
        hungryFamily.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        myHouse.pizzaGuy();
    }
}
