package org.spiel;

import org.Director;
import org.builders.LocationBuilder;
import org.locations.Location;
import org.locations.LocationTyp;
import org.services.IOService;

import java.util.ArrayList;

public class Spielwelt {
    private ArrayList<Location> besuchteStandorte;
    private LocationTyp aktuellerStandort;


    public Spielwelt() {
        this.aktuellerStandort = LocationTyp.STRAND;
        this.besuchteStandorte = new ArrayList<Location>();
    }

    public void builderTest() {
        // Es soll in Spielwelt sei
        Director director = new Director();
        LocationBuilder locationBuilder = new LocationBuilder();
        director.startLocationConstruiren(locationBuilder);
        Location loc1 = locationBuilder.build();
        besuchteStandorte.add(loc1);
        System.out.println(besuchteStandorte.size());
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

    public void setAktuellerStandort(IOService ioService) {
        String userStandort = "ioService".toUpperCase();

        for (LocationTyp ort : LocationTyp.values()) {
            //ort.name = String value
            //ort.name() = enum value
            //ort.ordinal()
            if (ort.toString().regionMatches(true, 0, userStandort, 0, 5) || Integer.parseInt(userStandort) == ort.ordinal()) {

                System.out.printf("Klasse! Du hast dich für %s entschieden. Bestätigen Sie bitte\n", ort);
//                if (eingabeObj.jaNeinAntwort()) this.aktuellerStandort = ort;
            }
        }
        System.out.println("Aktueller Standort ist " + this.aktuellerStandort.titel);
    }

    //TODO
    public void weltkarteZeigen() {

    }
}
