package org.inselTextSpiel.builders;

import org.inselTextSpiel.charaktere.NPC;
import org.inselTextSpiel.componente.Item;
import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationTyp;

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