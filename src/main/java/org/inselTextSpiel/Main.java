package org.inselTextSpiel;

import org.inselTextSpiel.charaktere.UserCharakter;
import org.inselTextSpiel.services.IOService;
import org.inselTextSpiel.services.JsonParser;
import org.inselTextSpiel.spiel.Spielwelt;

public class Main {
    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        Spielwelt spielwelt = new Spielwelt(parser);
        IOService ioService = new IOService(parser);
        UserCharakter userCharakter = null;

        ioService.ausgabe("spielwelt", "intro");
        ioService.trennlinie();
        // -------
        ioService.ausgabe("registrierung", "frage");
        if (ioService.antwortEinlesen().contains("j")) {
            ioService.ausgabe("registrierung", "antwortJa");
            ioService.trennlinie();
            ioService.ausgabe("registrierung", "name");
            userCharakter = new UserCharakter(ioService.antwortEinlesen());
            ioService.trennlinie();
        } else {
            ioService.ausgabe("registrierung", "antwortNein");
        }
        //--------

        ioService.ausgabe("charakter", "eigenschaften");
        if (ioService.antwortEinlesen().contains("j") && userCharakter == null) {
            ioService.ausgabe("charakter", "keinenChar");
            ioService.ausgabe("registrierung", "name");
            userCharakter = new UserCharakter(ioService.antwortEinlesen());
        }
        assert userCharakter != null;
        userCharakter.schowEigenschaften();
        ioService.trennlinie();
        ioService.ausgabe("charakter", "setMotto");
        userCharakter.setMotto(ioService.antwortEinlesen());
        ioService.ausgabe("charakter", "mottoInfo");
        ioService.trennlinie();
        ioService.ausgabe("locations", "intro");
        System.out.print(userCharakter.getMotto());

    }
}