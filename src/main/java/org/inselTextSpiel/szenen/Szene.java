package org.inselTextSpiel.szenen;

import org.inselTextSpiel.charaktere.NPC;
import org.inselTextSpiel.componente.Item;

import java.util.ArrayList;

public class Szene {
    private final String id;
    private final SzeneTyp typ;
    private final String beschreibung;
    private final ArrayList<NPC> npcArrayList;
    private final ArrayList<Item> itemArrayList;

    public Szene(
            String id,
            SzeneTyp typ,
            String beschreibung,
            ArrayList<NPC> npcArrayList,
            ArrayList<Item> itemArrayList) {
        this.id = id;
        this.typ = typ;
        this.beschreibung = beschreibung;
        this.npcArrayList = npcArrayList;
        this.itemArrayList = itemArrayList;
    }

    public String getId() {
        return id;
    }

    public SzeneTyp getSzeneTyp() {
        return typ;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public ArrayList<NPC> getNpcArrayList() {
        return npcArrayList;
    }

    public ArrayList<Item> getItemArrayList() {
        return itemArrayList;
    }
}
