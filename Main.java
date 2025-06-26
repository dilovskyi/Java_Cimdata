package org;

import org.charaktere.UserCharakter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Spielwelt umwelt = new Spielwelt();
        Ausgaben ausgaben = new Ausgaben();
        Eingaben eingaben = new Eingaben();

        // TODO Singletone;
        UserCharakter userCharakter = new UserCharakter("USErname");

        ausgaben.gameGeschichte();

        ausgaben.registrierung();
        ausgaben.jaNeinFragen("Tippe Ja/Nein ein");
        if (eingaben.jaNeinAntwort()) {
            ausgaben.wieHeisstDu();
            eingaben.registrierung(userCharakter);
            ausgaben.personalBegrüssung(userCharakter.getName());
        }

        ausgaben.jaNeinFragen("Möchtest du deine Eigenschaften ansehen?");
        if (eingaben.jaNeinAntwort()) {
            ausgaben.showEigenschaftenInfo(userCharakter.getEigenschaftenInfo());
        }

        ausgaben.jaNeinFragen("Möchtest du dein Motto setzen? Es kann dich im Kampf sehr gut ermutigen!");
        if (eingaben.jaNeinAntwort()) {
            eingaben.mottoEingeben(userCharakter);
        }

        umwelt.getAlleStandorte();

        Scanner scanner = new Scanner(System.in);
        umwelt.setAktuellerStandort(scanner.nextLine(), eingaben);
    }
}