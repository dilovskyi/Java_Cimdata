package org.woche1.schlangenInsel;

import org.woche1.schlangenInsel.umgebung.Umgebung;

public class Main {
  public static void main(String[] args) {
    Ausgaben ausgaben = new Ausgaben();
    Eingaben eingaben = new Eingaben();
    Umgebung umgebung = new Umgebung();

    // TODO Singletone;
    UserCharakter userCharakter = new UserCharakter("USErname");

    ausgaben.gameGeschichte();
    ausgaben.registrierung();
    eingaben.registrierung(userCharakter);
    ausgaben.personalBegrüssung(userCharakter.getName());
    ausgaben.showEigenschaftenInfo(userCharakter.getEigenschaftenInfo());
  }
}