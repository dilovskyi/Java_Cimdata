package org.woche1.schlangenInsel;

import java.util.Scanner;

public class Eingaben {
  Scanner sc = new Scanner(System.in);

  public void registrierung(UserCharakter userCharakter) {
    System.out.println("Wie heißt du, Reisender?");
    userCharakter.setName(sc.nextLine());
  };
}
