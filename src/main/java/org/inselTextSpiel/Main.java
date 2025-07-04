package org.inselTextSpiel;

import org.inselTextSpiel.charaktere.UserCharakter;
import org.inselTextSpiel.services.IOService;
import org.inselTextSpiel.services.JsonParser;
import org.inselTextSpiel.spiel.Spielwelt;

public class Main {
    public static void main(String[] args) {
        UserCharakter userCharakter = null;

        IOService.ausgabe("spielwelt", "intro");
        IOService.trennlinie();
        // -------
        IOService.ausgabe("registrierung", "frage");
        if (IOService.antwortEinlesen().contains("j")) {
            IOService.ausgabe("registrierung", "antwortJa");
            IOService.trennlinie();
            IOService.ausgabe("registrierung", "name");
            userCharakter = new UserCharakter(IOService.antwortEinlesen());
            IOService.trennlinie();
        } else {
            IOService.ausgabe("registrierung", "antwortNein");
        }
        //--------

        IOService.ausgabe("charakter", "eigenschaften");
        if (IOService.antwortEinlesen().contains("j") && userCharakter == null) {
            IOService.ausgabe("charakter", "keinenChar");
            IOService.ausgabe("registrierung", "name");
            userCharakter = new UserCharakter(IOService.antwortEinlesen());
        }
        assert userCharakter != null;
        userCharakter.schowEigenschaften();
        IOService.trennlinie();
        IOService.ausgabe("charakter", "setMotto");
        userCharakter.setMotto(IOService.antwortEinlesen());
        IOService.ausgabe("charakter", "mottoInfo");
        IOService.trennlinie();
        IOService.ausgabe("locations", "intro");
        System.out.print(userCharakter.getMotto());

    }
}