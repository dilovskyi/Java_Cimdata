package org.woche1.schlangenInsel;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GameCharakter {
    private String name;
    String kampfmotto;
    int alter;
    int lebenspunkte;
    int weisheit;

    public GameCharakter(String name) {
        this.name = name;
        this.alter = getRandomZahl(100);
        this.lebenspunkte = getRandomZahl(1000);
        this.weisheit = alter > 60 ? alter * 20 : alter * 10;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getMotto() {
        return this.kampfmotto;
    }

    public void setMotto(String motto) {
        this.kampfmotto = Objects.equals(motto, "") ? "keines" : motto;
    }

    public Map<String, Object> getEigenschaftenInfo() {
        Map<String, Object> daten = new HashMap<>();
        daten.put("name", name);
        daten.put("kampfmotto", kampfmotto);
        daten.put("alter", alter);
        daten.put("lebenspunkte", lebenspunkte);
        daten.put("weisheit", weisheit);
        return daten;
    }

    @Override
    public String toString() {
        String str = String.format("""
                Name: %s,
                Alter: %d,
                Lebenspunkte: %d,
                Lebenserfahrung: %d\n""", this.name, this.alter, this.lebenspunkte,
                this.weisheit);
        return str;
    }

    public int getWeisheit() {
        return this.weisheit;
    }

    public void setWeisheit(int lebenserfahrung) {
        this.weisheit = lebenserfahrung;
    }

    private int getRandomZahl(int obereGrenze) {
        return (int) Math.round(Math.random() * obereGrenze);
    }
}
