package org.woche1.schlangenInsel;

import java.util.Scanner;

public class Eingaben {
  Scanner sc = new Scanner(System.in);

  public boolean jaNeinAntwort() {
    return sc.nextLine().toLowerCase().contains("y") ? true : false;
  }

  public void registrierung(UserCharakter userCharakter) {
    userCharakter.setName(sc.nextLine());
  };

  public void mottoEingeben(UserCharakter userCharakter) {
    userCharakter.setMotto(sc.nextLine());
  }
}
