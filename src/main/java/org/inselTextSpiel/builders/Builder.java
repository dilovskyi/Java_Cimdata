package org.inselTextSpiel.builders;

import org.inselTextSpiel.componente.Scene;
import org.inselTextSpiel.locations.Location;
import org.inselTextSpiel.locations.LocationTyp;

import java.util.ArrayList;

public interface Builder {
    void setTyp(LocationTyp typ);

    void setTitel(String titel);

    void setBeschreibung(String beschreibung);

    void setSceneArrayList(ArrayList<Scene> sceneArrayList);

    void setVorherigerLocation(Location location);

    void setNeachsterLocation(Location location);
}