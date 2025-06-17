package org.woche1.schlangenInsel;

import java.util.Scanner;

public class Eingaben {
  Scanner sc = new Scanner(System.in);

  public String registrierung() {
    System.out.println("Wie heißt du, Reisender?");
    return sc.nextLine();
  };
}
