package org.inselTextSpiel.szenen;

import org.inselTextSpiel.charaktere.NPC;
import org.inselTextSpiel.componente.Item;

import java.util.ArrayList;
import java.util.Map;

public class SzeneBuilder implements SzeneBuilderInterface{
    private String id;
    private SzeneTyp typ;
    private String beschreibung;
    private ArrayList<NPC> npcArrayList;
    private ArrayList<Item> itemArrayList;

    @Override
    public void setId(String id) {
    this.id = id;
    }

    @Override
    public void setTyp(SzeneTyp typ) {
        this.typ = typ;
    }

    @Override
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public void setNPCArrayList(ArrayList<NPC> npcArrayList) {
        this.npcArrayList = npcArrayList;
    }

    @Override
    public void setItemArrayList(ArrayList<Item> itemArrayList) {
        this.itemArrayList = itemArrayList;
    }

    @Override
    public void setEntscheidungen(Map<String, String> entscheidungen) {

    }
    @Override
    public Szene build () {
        return new Szene(
                this.id,
                this.typ,
                this.beschreibung,
                this.npcArrayList,
                this.itemArrayList
        );
    }
}
