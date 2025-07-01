package org.inselTextSpiel;

import org.inselTextSpiel.builders.LocationBuilder;
import org.inselTextSpiel.charaktere.NPC;
import org.inselTextSpiel.componente.Item;
import org.inselTextSpiel.locations.LocationTyp;

import java.util.ArrayList;

public class Director {

    public void locationConstruiren(LocationBuilder builder) {
        builder.setTyp(LocationTyp.BRUECKE);
        builder.setTitel(LocationTyp.BRUECKE.titel);
        builder.setBeschreibung("Eine alte, morsche Brücke spannt sich über einen tiefen Abgrund. Jeder Schritt knarrt.\n");
        builder.setMusic();
        builder.setItemArrayList(new ArrayList<Item>());
        builder.setNpcArrayList(new ArrayList<NPC>());
//        builder.setVorherigerOrt();
//        builder.setNeachsterOrt();
    }

    public void startLocationConstruiren(LocationBuilder builder) {
        builder.setTyp(LocationTyp.STRAND);
        builder.setTitel(LocationTyp.STRAND.titel);
        builder.setBeschreibung("""
                Deine Reise beginnt am östlichen Strand.
                Vor dir erstreckt sich dichter Dschungel. Hinter dir liegt das endlose Meer.
                Du hast keine Wahl! Du musst dir Hilfe suchen!
                """);
        builder.setMusic();
        // Start Items aufschreiben
        builder.setItemArrayList(new ArrayList<Item>());
        builder.setNpcArrayList(new ArrayList<NPC>());
//        builder.setVorherigerOrt();
//        builder.setNeachsterOrt();
    }

    public void dschungelSceneConstruiren(LocationBuilder builder) {
        builder.setTyp(LocationTyp.DSCHUNGEL);
        builder.setTitel(LocationTyp.DSCHUNGEL.titel);
        builder.setBeschreibung("""
                Du stehst am Rand des Dschungels. Die Bäume sind dicht und lassen kaum Licht durch.
                Überall hörst du das Rascheln von Blättern und unbekannte Tierlaute.
                Die Luft ist feucht und schwer – vor dir liegt das Unbekannte.
                """);
        builder.setMusic();

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Machete", "Ein scharfes Werkzeug, um dir den Weg durch das Dickicht zu bahnen."));
        builder.setItemArrayList(items);

        ArrayList<NPC> npcs = new ArrayList<>();
        npcs.add(new NPC("Wächter des Waldes! Ein alter Mann mit bemaltem Gesicht. Er scheint dich schon zu erwarten."));
        builder.setNpcArrayList(npcs);
    }
}