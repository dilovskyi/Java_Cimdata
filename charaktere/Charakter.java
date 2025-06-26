package org.charaktere;

import java.util.HashMap;
import java.util.Map;

public class Charakter {
    int lebenspunkte;
    private String name;

    public Charakter(String name) {
        this.name = name;
        this.lebenspunkte = getRandomZahl(1000);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Map<String, Object> getEigenschaftenInfo() {
        Map<String, Object> daten = new HashMap<>();
        daten.put("name", this.name);
        daten.put("lebenspunkte", this.lebenspunkte);
        return daten;
    }

//    @Override
//    public String toString() {
//        String str = String.format("""
//                        Name: %s,
//                        Alter: %d,
//                        Lebenspunkte: %d,
//                        Lebenserfahrung: %d\n""", this.name, this.alter, this.lebenspunkte,
//                this.weisheit);
//        return str;
//    }


    protected int getRandomZahl(int obereGrenze) {
        return (int) Math.round(Math.random() * obereGrenze);
    }
}
