package org.inselTextSpiel.locations;

import org.inselTextSpiel.componente.Scene;

import java.util.ArrayList;

public class Location {
    private final LocationTyp typ;
    private final String titel;
    private final String beschreibung;
    private final ArrayList<Scene> sceneArrayList;
    private final Location vorherigerLocation;
    private final Location neachsterLocation;

    public Location(
            LocationTyp typ,
            String titel,
            String beschreibung,
            ArrayList<Scene> sceneArrayList,
            Location vorherigerLocation,
            Location neachsterLocation
    ) {
        this.typ = typ;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.sceneArrayList = sceneArrayList;
        this.vorherigerLocation = vorherigerLocation;
        this.neachsterLocation = neachsterLocation;
    }

    public LocationTyp getTyp() {
        return this.typ;
    }

    public String getTitel() {
        return this.titel;
    }

    public String getBeschreibung() {
        return this.beschreibung;
    }


    public ArrayList<Scene> getSceneArrayList() {
        return this.sceneArrayList;
    }

    public Location getVorherigerLocation() {
        return this.vorherigerLocation;
    }

    public Location getNeachsterLocation() {
        return this.neachsterLocation;
    }
}
