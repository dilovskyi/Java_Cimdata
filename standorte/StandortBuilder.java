package org.standorte;

import org.charaktere.NonPlayerCharakter;
import org.standorte.componente.Item;

import java.util.ArrayList;

public class StandortBuilder implements Builder {
    @Override
    public void setNonPlayerCharachter(NonPlayerCharakter charakter) {

    }

    @Override
    public void setBeschreibung(String beschreibung) {

    }

    @Override
    public void setStandort(Standort standort) {

    }

    @Override
    public void setNaechsterStandort(Standort standort) {

    }

    @Override
    public void setVorherigerStandort(Standort standort) {

    }

    @Override
    public void setItems(ArrayList<Item> i) {

    }

    @Override
    public void setMusic() {

    }

    @Override
    public Standort getResultat() {

        return new Standort();
    }
}
