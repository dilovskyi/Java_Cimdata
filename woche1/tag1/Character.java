package org.woche1.tag1;

public class Character {
    String nickName;
    String kampfmotto;
    int alter;
    int lebenspunkte;
    int lebenserfahrung;

    public Character(String nickName, String motto) {
        this.nickName = nickName;
        this.kampfmotto = motto;
        this.alter = getRandomZahl(100);
        this.lebenspunkte = getRandomZahl(1000);
        this.lebenserfahrung = alter > 60 ? alter * 20 : alter * 10;
    }

    public void getEigenschaften() {
        System.out.printf("""
                        Name: %s,
                        Alter: %d,
                        Lebenspunkte: %d,
                        Lebenserfahrung: %d""",
                this.nickName, this.alter, this.lebenspunkte, this.lebenserfahrung);
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
