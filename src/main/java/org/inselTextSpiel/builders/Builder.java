package org.inselTextSpiel.builders;

import org.inselTextSpiel.szenen.Szene;
import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationTyp;

import java.util.ArrayList;

public interface Builder {
    void setTyp(LocationTyp typ);

    void setTitel(String titel);

    void setBeschreibung(String beschreibung);

    void setSzenesArrayList(ArrayList<Szene> szenesArrayList);

    void setVorherigerLocation(Location location);

    void setNeachsterLocation(Location location);
}