package com.example.lamierosa_projects.p2;

public class Situation {
    private String title;
    private String name;
    private int  dhp;
    private int dsan;
    private int dcoins;
    protected Situation[] answers;

    public Situation(String title, String name, int dhp, int dsan, int dcoins, int n) {
        this.title = title;
        this.name = name;
        this.dhp = dhp;
        this.dsan = dsan;
        this.dcoins = dcoins;
        this.answers = new Situation[n];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDhp() {
        return dhp;
    }

    public void setDhp(int dhp) {
        this.dhp = dhp;
    }

    public int getDsan() {
        return dsan;
    }

    public void setDsan(int dsan) {
        this.dsan = dsan;
    }

    public int getDcoins() {
        return dcoins;
    }

    public void setDcoins(int dcoins) {
        this.dcoins = dcoins;
    }

    public Situation[] getAnswers() {
        return answers;
    }

    public void setAnswers(Situation[] answers) {
        this.answers = answers;
    }
}
