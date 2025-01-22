package com.example.androidosipov.p2;

public class Shop extends Thread{
    Account account;

    public Shop(Account account) {
        this.account = account;
    }

    public void run() {
        synchronized (account) {
            if (account.getAmount() >= 70) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                account.setAmount(account.getAmount() - 70);
            } else {
                System.out.println("No enough money");
            }
        }
        System.out.println("Account balance: " + account.getAmount());
    }


    public static void main(String[] args) {

        if (true) {
            Account account = new Account(100);
            Shop shop = new Shop(account);
            Shop shop2 = new Shop(account);

            shop.start();
            shop2.start();
        }
    }
}
