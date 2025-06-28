package org.spiel;

import org.Eingaben;
import org.locations.Location;
import org.locations.LocationTyp;

import java.util.ArrayList;

public class Spielwelt {
    private ArrayList<Location> besuchteStandorte;
    private LocationTyp aktuellerStandort;

    public Spielwelt() {
        this.aktuellerStandort = LocationTyp.STRAND;
    }

    public void respawn() {
        this.aktuellerStandort = LocationTyp.STRAND;
        System.out.println("Du bist am Anfang. Viel Glück!");
    }

    public void setBesuchterStandort() {
//        besuchteStandorte.add();
    }

    public void zeigenBesuchteStandorte() {
        for (Location location : besuchteStandorte) {
            System.out.println(location);
        }
    }

    public void getAlleStandorte() {
        for (LocationTyp standort : LocationTyp.values()) {
            System.out.println(standort.ordinal() + " " + standort.titel);
        }
    }

    private LocationTyp getAktuellerStandort() {
        return this.aktuellerStandort;
    }

    public void setAktuellerStandort(String userInput, Eingaben eingabeObj) {
        String userStandort = userInput.toUpperCase();

        for (LocationTyp ort : LocationTyp.values()) {
            //ort.name = String value
            //ort.name() = enum value
            //ort.ordinal()
            if (ort.toString().regionMatches(true, 0, userStandort, 0, 5) || Integer.parseInt(userStandort) == ort.ordinal()) {

                System.out.printf("Klasse! Du hast dich für %s entschieden. Bestätigen Sie bitte\n", ort);
                if (eingabeObj.jaNeinAntwort()) this.aktuellerStandort = ort;
            }
        }
        System.out.println("Aktueller Standort ist " + this.aktuellerStandort.titel);
    }

    //TODO
    public void zeigeWeltkarte() {

    }
}
