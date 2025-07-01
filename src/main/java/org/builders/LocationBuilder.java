package org.builders;

import org.charaktere.NPC;
import org.componente.Item;
import org.locations.Location;
import org.locations.LocationTyp;

import java.util.ArrayList;

public class LocationBuilder implements Builder {
    private LocationTyp typ;
    private String titel;
    private String beschreibung;
    private String music;
    private ArrayList<NPC> npcArrayList;
    private ArrayList<Item> itemArrayList;
    private Location vorherigerLocation;
    private Location neachsterLocation;

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
    public void setMusic() {
        this.music = music;
    }

    @Override
    public void setNpcArrayList(ArrayList<NPC> npcArrayList) {
        this.npcArrayList = npcArrayList;
    }

    @Override
    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    //Welche Standorte sind von hier aus erreichbar
    // doppelt verkettete Liste (Doubly linked list)
    @Override
    public void setVorherigerOrt(Location location) {

    }

    @Override
    public void setNeachsterOrt(Location location) {

    }

    public Location build() {
        return new Location(
                this.typ,
                this.titel,
                this.beschreibung,
                this.music,
                this.npcArrayList,
                this.itemArrayList,
                this.vorherigerLocation,
                this.neachsterLocation);
    }
}
