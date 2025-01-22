package com.example.androidosipov.p2;

public class Account {
    private String fio;
    private int amount;

    public Account(int a) {
        this.setAmount(a);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



}
