package org.umgebung;

public class Umgebung {
    Himmelsrichtungen aktuellerStandort;
    Himmelsrichtungen gespeicherterStandort;

    public void respawn() {
        this.aktuellerStandort = Himmelsrichtungen.STRAND;
        System.out.println("Du bist am Anfang. Viel Glück!");
    }

    enum Himmelsrichtungen {
        STRAND, NORDEN, OSTEN, SÜDEN, WESTEN,
    }
}
