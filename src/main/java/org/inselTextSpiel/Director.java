package org.inselTextSpiel;

import org.inselTextSpiel.builders.LocationBuilder;
import org.inselTextSpiel.componente.Scene;
import org.inselTextSpiel.locations.LocationTyp;

import java.util.ArrayList;
import java.util.Map;

public class Director {

    public void startLocationConstruiren(LocationBuilder builder) {
        builder.setTyp(LocationTyp.STRAND);
        builder.setTitel(LocationTyp.STRAND.titel);
        builder.setBeschreibung("""
                Deine Reise beginnt am östlichen Strand.
                Vor dir erstreckt sich dichter Dschungel. Hinter dir liegt das endlose Meer.
                Du hast keine Wahl! Du musst dir Hilfe suchen!
                """);
        builder.setSceneArrayList(new ArrayList<Scene>());
//        builder.setVorherigerOrt();
//        builder.setNeachsterOrt();
    }

    public void locationVonMapConstruieren(LocationBuilder builder, Map<String, String> locationMap) {
        builder.setTyp(LocationTyp.valueOf(locationMap.get("typ")));
        builder.setTitel(locationMap.get("titel"));
        builder.setBeschreibung(locationMap.get("beschreibung"));
    }
}