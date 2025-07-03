package org.inselTextSpiel.spiel;

import org.inselTextSpiel.Director;
import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationTyp;
import org.inselTextSpiel.services.IOService;
import org.inselTextSpiel.services.JsonParser;

import java.util.ArrayList;

public class Spielwelt {
    private ArrayList<Location> locationsArrayList;
    private Location aktuelleLocation;
    private Director director;

    public Spielwelt(JsonParser parser) {
        // Parser: Laden von JSON und Parsen in Datastrukturen
        director = new Director(parser);
        this.locationsArrayList = director.buildAllLokations();
        this.aktuelleLocation = locationsArrayList.getFirst();
    }

    public void restast() {
        this.aktuelleLocation = locationsArrayList.getFirst();
        System.out.println("Du bist am Anfang. Viel Glück!");
    }

    private Location getAktuelleLocation() {
        return this.aktuelleLocation;
    }

    public void setAktuelleLocation(Location location) {
        this.aktuelleLocation = location;
    }

    //TODO
    public void weltkarteZeigen() {

    }
}
