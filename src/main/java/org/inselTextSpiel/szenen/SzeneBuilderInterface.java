package org.inselTextSpiel.szenen;

import org.inselTextSpiel.charaktere.NPC;
import org.inselTextSpiel.componente.Item;

import java.util.ArrayList;
import java.util.Map;

public interface SzeneBuilderInterface {
    void setId(String id);
    void setTyp(SzeneTyp typ); // Enum: KAMPF, STORY, etc.
    void setBeschreibung(String beschreibung);

    void setNPCArrayList(ArrayList<NPC> npcArrayList); // nur bei Kampfszenen
    void setItemArrayList(ArrayList<Item> itemArrayList); // bei Fund
    void setEntscheidungen(Map<String, String> entscheidungen); // universell
//    void setWirkung(Wirkung wirkung); // z. B. bei Fund/Falle
    Szene build () ;
}
