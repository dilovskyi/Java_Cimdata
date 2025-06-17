package org.woche1.schlangenInsel;

public class Umgebung {
    Himmelsrichtungen aktuelleStandort;
    Himmelsrichtungen gespeicherterStandort;

    public Umgebung() {

    }

    public void respawn() {
        this.aktuelleStandort = Himmelsrichtungen.STRAND;
        System.out.println("Du bist am Anfang. Viel Glück!");
    }

    enum Himmelsrichtungen {
        STRAND, NORDEN, OSTEN, SÜDEN, WESTEN,
    }
}
