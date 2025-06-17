package org.woche1.schlangenInsel.umgebung;

public class Umgebung {
  Himmelsrichtungen aktuelleStandort;
  Himmelsrichtungen gespeicherterStandort;

  public void respawn() {
    this.aktuelleStandort = Himmelsrichtungen.STRAND;
    System.out.println("Du bist am Anfang. Viel Glück!");
  }

  enum Himmelsrichtungen {
    STRAND, NORDEN, OSTEN, SÜDEN, WESTEN,
  }
}
