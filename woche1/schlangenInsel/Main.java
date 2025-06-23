package org.woche1.schlangenInsel;

import org.woche1.schlangenInsel.umgebung.Umgebung;

public class Main {
  public static void main(String[] args) {
    Ausgaben ausgaben = new Ausgaben();
    Eingaben eingaben = new Eingaben();
    // Umgebung umgebung = new Umgebung();

    // TODO Singletone;
    UserCharakter userCharakter = new UserCharakter("USErname");

    ausgaben.gameGeschichte();
    ausgaben.registrierung();

    if (eingaben.jaNeinAntwort()) {
      ausgaben.wieHeisstDu();
      eingaben.registrierung(userCharakter);
      ausgaben.personalBegrüssung(userCharakter.getName());
    }
    ausgaben.jaNeinFragen("Möchtest du deine Charakteristiken ansehen?");
    if (eingaben.jaNeinAntwort()) {
      ausgaben.showEigenschaftenInfo(userCharakter.getEigenschaftenInfo());
    }
    ausgaben.jaNeinFragen("Möchtest du dein Motto setzen? Es kann dich im Kampf sehr gut entmutigen!");
    if (eingaben.jaNeinAntwort()) {
      eingaben.mottoEingeben(userCharakter);
    }
  }
}