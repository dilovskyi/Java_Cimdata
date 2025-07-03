package org.inselTextSpiel.locations;

import org.inselTextSpiel.szenen.Szene;

import java.util.ArrayList;

public interface LocationBuilderInterface {
    void setTyp(LocationTyp typ);

    void setTitel(String titel);

    void setBeschreibung(String beschreibung);

    void setSzenesArrayList(ArrayList<Szene> szenesArrayList);

    void setVorherigerLocation(Location location);

    void setNeachsterLocation(Location location);

    Location build ();
}