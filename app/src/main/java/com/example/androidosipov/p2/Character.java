package com.example.androidosipov.p2;

public class Character {
    private String name;
    private int hp;
    private int san;
    private int coins;

    public Character(String name, int hp, int san, int coin) {
        this.name = name;
        this.hp = hp;
        this.san = san;
        this.coins = coin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSan() {
        return san;
    }

    public void setSan(int san) {
        this.san = san;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
