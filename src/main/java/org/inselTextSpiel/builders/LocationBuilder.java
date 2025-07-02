package org.inselTextSpiel.builders;

import org.inselTextSpiel.componente.Scene;
import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationTyp;

import java.util.ArrayList;

public class LocationBuilder implements Builder {
    private LocationTyp typ;
    private String titel;
    private String beschreibung;
    private String music;
    private ArrayList<Scene> sceneArrayList = new ArrayList<Scene>();
    private Location vorherigerLocation = null;
    private Location neachsterLocation = null;

    @Override
    public void setTyp(LocationTyp typ) {
        this.typ = typ;
    }

    @Override
    public void setTitel(String titel) {
        this.titel = titel;
    }


    @Override
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public void setSceneArrayList(ArrayList<Scene> sceneArrayList) {
        this.sceneArrayList = sceneArrayList;
    }

    public void addScene(Scene scene) {
        this.sceneArrayList.add(scene);
    }

    //Welche Standorte sind von hier aus erreichbar
    // doppelt verkettete Liste (Doubly linked list)
    @Override
    public void setVorherigerLocation(Location location) {
        this.vorherigerLocation = location;
    }

    @Override
    public void setNeachsterLocation(Location location) {
        this.neachsterLocation = location;
    }

    public Location build() {
        return new Location(
                this.typ,
                this.titel,
                this.beschreibung,
                this.sceneArrayList,
                this.vorherigerLocation,
                this.neachsterLocation);
    }
}
