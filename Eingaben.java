package org;

import org.charaktere.UserCharakter;

import java.util.Scanner;

public class Eingaben {
    Scanner sc = new Scanner(System.in);

    public boolean jaNeinAntwort() {
        return sc.nextLine().toLowerCase().contains("j");
    }

    public void registrierung(UserCharakter userCharakter) {
        userCharakter.setName(sc.nextLine());
        System.out.printf("""
                Charakter names <%s> wurde erfolgreich erstell.
                Alle Charakteristigen wurde zufaligeweise eingestzt
                """, userCharakter.getName());
    }


    public void mottoEingeben(UserCharakter userCharakter) {
        userCharakter.setMotto(sc.nextLine());
    }
}
