package org.inselTextSpiel.builders;

import org.inselTextSpiel.szenen.Szene;
import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationTyp;

import java.util.ArrayList;

public class LocationBuilder implements Builder {
    private LocationTyp typ;
    private String titel;
    private String beschreibung;
    private String music;
    private ArrayList<Szene> szenesArrayList = new ArrayList<Szene>();
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
    public void setSzenesArrayList(ArrayList<Szene> szenesArrayList) {
        this.szenesArrayList = szenesArrayList;
    }

    public void addScene(Szene scene) {
        this.szenesArrayList.add(scene);
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
                this.szenesArrayList,
                this.vorherigerLocation,
                this.neachsterLocation);
    }
}
