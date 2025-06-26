package org.standorte;

import org.charaktere.NonPlayerCharakter;
import org.standorte.componente.Item;

import java.util.ArrayList;

public interface Builder {
    void setNonPlayerCharachter(NonPlayerCharakter charakter);

    void setBeschreibung(String beschreibung);

    void setStandort(Standort standort);

    //Welche Standorte sind von hier aus erreichbar
    void setNaechsterStandort(Standort standort);

    void setVorherigerStandort(Standort standort);

    void setItems(ArrayList<Item> i);

    void setMusic();

    Standort getResultat();
}