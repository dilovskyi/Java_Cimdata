package org.woche1.schlangenInsel;

import org.woche1.schlangenInsel.umgebung.Umgebung;

public class Main {
  public static void main(String[] args) {
    String name;
    Aussagen aussagen = new Aussagen();
    Eingaben eingaben = new Eingaben();
    Umgebung umgebung = new Umgebung();
    // TODO
    GameCharakter person = new GameCharakter("USErname");

    aussagen.willkommenText();
    name = eingaben.registrierung();
    aussagen.personalBegrüssung(name);
  }
}