package org.locations;

import org.charaktere.NPC;
import org.componente.Item;

import java.util.ArrayList;

public class Location {
    private final LocationTyp typ;
    private final String titel;
    private final String beschreibung;
    private final String music;
    private final ArrayList<NPC> npcArrayList;
    private final ArrayList<Item> itemArrayList;
    private final Location vorherigerLocation;
    private final Location neachsterLocation;

    public Location(
            LocationTyp typ,
            String titel,
            String beschreibung,
            String music,
            ArrayList<NPC> npcArrayList,
            ArrayList<Item> itemArrayList,
            Location vorherigerLocation,
            Location neachsterLocation
    ) {
        this.typ = typ;
        this.titel = titel;
        this.beschreibung = beschreibung;
        this.music = music;
        this.npcArrayList = npcArrayList;
        this.itemArrayList = itemArrayList;
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

    public String getMusic() {
        return this.music;
    }

    public ArrayList<NPC> getNpcArrayList() {
        return this.npcArrayList;
    }

    public ArrayList<Item> getItemArrayList() {
        return this.itemArrayList;
    }

    public Location getVorherigerLocation() {
        return this.vorherigerLocation;
    }

    public Location getNeachsterLocation() {
        return this.neachsterLocation;
    }
}
