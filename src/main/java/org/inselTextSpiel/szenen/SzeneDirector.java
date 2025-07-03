package org.inselTextSpiel.szenen;

import org.inselTextSpiel.locations.LocationTyp;

import java.util.Map;

public class SzeneDirector {
    SzeneBuilder builder = new SzeneBuilder();

    public Szene buildSzeneVonMap(Map<String, String> szeneMap) {
        builder.setId(szeneMap.get("id"));
        builder.setTyp(SzeneTyp.valueOf(szeneMap.get("typ")));
        builder.setBeschreibung(szeneMap.get("beschreibung"));
        return builder.build();

//        String schwierigkeit = getZufaelligeStufe(typ); // z. B. LEICHT/MEDIUM/HARD
//        Map<String, String> locationMap = parser.getNodeAlsKeyValue("locations", locationTyp.name().toLowerCase());
//        return zufaelligeSzenenAuswaehlen(szenenPool, 5); // 5 pro Location
    }


//        String schwierigkeit = getZufaelligeStufe(typ); // z. B. LEICHT/MEDIUM/HARD
//        Map<String, String> locationMap = parser.getNodeAlsKeyValue("locations", locationTyp.name().toLowerCase());
//        return zufaelligeSzenenAuswaehlen(szenenPool, 5); // 5 pro Location
}
