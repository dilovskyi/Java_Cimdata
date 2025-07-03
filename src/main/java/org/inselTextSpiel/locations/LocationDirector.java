package org.inselTextSpiel.locations;

import org.inselTextSpiel.szenen.Szene;

import java.util.ArrayList;
import java.util.Map;

public class LocationDirector {
    LocationBuilder builder = new LocationBuilder();

    public void startLocationConstruiren(LocationBuilder builder) {
        builder.setTyp(LocationTyp.STRAND);
        builder.setTitel(LocationTyp.STRAND.titel);
        builder.setBeschreibung("""
                Deine Reise beginnt am östlichen Strand.
                Vor dir erstreckt sich dichter Dschungel. Hinter dir liegt das endlose Meer.
                Du hast keine Wahl! Du musst dir Hilfe suchen!
                """);
        builder.setSzenesArrayList(new ArrayList<Szene>());
//        builder.setVorherigerOrt();
//        builder.setNeachsterOrt();
    }

    public Location buildLocationVonMap(Map<String, String> locationMap) {
        builder.setTyp(LocationTyp.valueOf(locationMap.get("typ")));
        builder.setTitel(locationMap.get("titel"));
        builder.setBeschreibung(locationMap.get("beschreibung"));
        return builder.build();
    }
}