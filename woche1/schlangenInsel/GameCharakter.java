package org.woche1.schlangenInsel;

import java.util.Objects;

public class GameCharakter {
    String nickname;
    String kampfmotto;
    int alter;
    int lebenspunkte;
    int lebenserfahrung;

    public GameCharakter(String nickname) {
        this.nickname = nickname;
        this.alter = getRandomZahl(100);
        this.lebenspunkte = getRandomZahl(1000);
        this.lebenserfahrung = alter > 60 ? alter * 20 : alter * 10;
    }

    public String getMotto() {
        return this.kampfmotto;
    }

    public void setMotto(String motto) {
        this.kampfmotto = Objects.equals(motto, "") ? "keines" : motto;
    }

    public void getEigenschaften() {
        System.out.printf("""
                Name: %s,
                Alter: %d,
                Lebenspunkte: %d,
                Lebenserfahrung: %d\n""", this.nickname, this.alter, this.lebenspunkte, this.lebenserfahrung);
    }

    public int getLegenserfahrung() {
        return this.lebenserfahrung;
    }

    public void setLebenserfahrung(int lebenserfahrung) {
        this.lebenserfahrung = lebenserfahrung;
    }

    private int getRandomZahl(int obereGrenze) {
        return (int) Math.round(Math.random() * obereGrenze);
    }
}
