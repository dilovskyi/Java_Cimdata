package org.builders;

import org.charaktere.NPC;
import org.componente.Item;
import org.locations.Location;
import org.locations.LocationTyp;

import java.util.ArrayList;

public interface Builder {
    void setTyp(LocationTyp typ);

    void setTitel(String titel);

    void setBeschreibung(String beschreibung);

    void setMusic();

    void setNpcArrayList(ArrayList<NPC> npcArrayList);

    void setItemArrayList(ArrayList<Item> itemArrayList);

    //Welche Standorte sind von hier aus erreichbar
    // doppelt verkettete Liste (Doubly linked list)
    void setVorherigerOrt(Location location);

    void setNeachsterOrt(Location location);
}