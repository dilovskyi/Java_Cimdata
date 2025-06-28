package org;

import org.builders.LocationBuilder;
import org.charaktere.NPC;
import org.componente.Item;
import org.locations.LocationTyp;

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
    
}

/*
strand
Strand
Du wachst auf dem warmen, feuchten Sand auf. Das Meer rauscht hinter dir, vor dir Dschungel.
dschungelrand
Dschungelrand
Du stehst am Rand des dichten Dschungels. Du hörst Vögel und das Rascheln von Blättern.
haengebruecke
Hängebrücke
Eine alte, morsche Brücke spannt sich über einen tiefen Abgrund. Jeder Schritt knarrt.
verlassene_huette
Verlassene Hütte
Eine verfallene Hütte mit eingerissenen Wänden – aber vielleicht findest du hier etwas.
hoehle
Dunkle Höhle
Es ist kalt und feucht. Tropfwasser. Vielleicht verbirgt sich hier ein Schatz… oder etwas anderes.
wasserfall
Wasserfall
Hinter dem rauschenden Wasser scheint eine geheime Passage zu liegen.
verfluchter_tempel
Verfluchter Tempel
Mächtige Steinstatuen bewachen den Eingang. Ein Ort voller Geheimnisse und Prüfungen.
nebelmoor
Nebelmoor
Dichter Nebel schränkt deine Sicht ein. Alles ist feucht, modrig und unheimlich.
lagerplatz
Lagerplatz
Ein sicherer Ort mit Feuerstelle. Hier kannst du rasten und neue Kraft schöpfen.
geheime_bucht
Geheime Bucht
Eine kleine, geschützte Bucht mit einem alten Ruderboot. Vielleicht ein Fluchtweg?

 */