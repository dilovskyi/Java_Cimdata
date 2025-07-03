package org.inselTextSpiel;

import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationDirector;
import org.inselTextSpiel.locations.LocationTyp;
import org.inselTextSpiel.services.JsonParser;

import java.util.ArrayList;
import java.util.Map;

public class Director {
    LocationDirector locationDirector = new LocationDirector();
    JsonParser parser;

    public Director(JsonParser parser) {
        this.parser = parser;
    }

    public ArrayList<Location> buildAllLokations() {
        ArrayList<Location> locationsArrayList = new ArrayList<Location>();

        for (LocationTyp locationTyp : LocationTyp.values()) {
            Map<String, String> locationMap = parser.getKeyValue("locations", locationTyp.name().toLowerCase());
            Location location = locationDirector.buildLocationVonMap(locationMap);

            locationsArrayList.add(location);
        }
        return locationsArrayList;
    }
}
