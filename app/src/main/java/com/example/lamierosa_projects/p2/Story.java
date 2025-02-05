package com.example.lamierosa_projects.p2;

public class Story {
    private Situation start;
    private Situation current;
    private Character character;

    public Story(Situation start, Character character) {
        this.start = start;
        this.current = start;
        this.character = character;
    }

    public boolean isEnd() {
        int n = this.current.getAnswers().length;
        return n == 0;
    }

    public void go(int answer) {
        int n = this.current.getAnswers().length;
        if (answer <= n) {
            this.current = this.current.getAnswers()[answer - 1];
            this.character.setSan(character.getSan() + current.getDsan());
            this.character.setHp(character.getHp() + current.getDhp());
            this.character.setCoins(character.getCoins() + current.getDcoins());
        } else {
            System.out.println("Такого варианта ответа нет!");
        }
    }

    public Situation getStart() {
        return start;
    }

    public void setStart(Situation start) {
        this.start = start;
    }

    public Situation getCurrent() {
        return current;
    }

    public void setCurrent(Situation current) {
        this.current = current;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
