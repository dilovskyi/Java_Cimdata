package org.inselTextSpiel.spiel;

import org.inselTextSpiel.Director;
import org.inselTextSpiel.builders.LocationBuilder;
import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationTyp;
import org.inselTextSpiel.services.IOService;
import org.inselTextSpiel.services.JsonParser;

import java.util.ArrayList;
import java.util.Map;

public class Spielwelt {
    private final ArrayList<Location> locationsArrayList = new ArrayList<Location>();
    private LocationTyp aktuellerStandort;
    private JsonParser parser;


    public Spielwelt(JsonParser parser) {
        this.aktuellerStandort = LocationTyp.STRAND;
        spielWeltErschaffung(parser);
    }
    
    private void spielWeltErschaffung(JsonParser parser) {
        Director director = new Director();
        LocationBuilder builder = new LocationBuilder();
        for (LocationTyp locationTyp : LocationTyp.values()) {
            Map<String, String> locationMap = parser.getKeyValue("locations", locationTyp.name().toLowerCase());
            director.locationVonMapConstruieren(builder, locationMap);
            locationsArrayList.add(builder.build());
        }
    }

    public void respawn() {
        this.aktuellerStandort = LocationTyp.STRAND;
        System.out.println("Du bist am Anfang. Viel Glück!");
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
