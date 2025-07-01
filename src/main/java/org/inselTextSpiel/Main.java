package org.inselTextSpiel;

import org.inselTextSpiel.charaktere.UserCharakter;
import org.inselTextSpiel.services.IOService;
import org.inselTextSpiel.spiel.Spielwelt;

// Entweden mehrere kleine Dateien oder eine große mit key als "themen".
public class Main {
    public static void main(String[] args) {
        Spielwelt spielwelt = new Spielwelt();
        IOService ioService = new IOService("spielwelt.json");
        UserCharakter userCharakter = null;

        ioService.ausgabe("intro");
        ioService.trennlinie();
        // -------
        ioService.ausgabe(new String[]{"registrierung", "frage"});
        if (ioService.antwortEinlesen().contains("j")) {
            ioService.ausgabe(new String[]{"registrierung", "antwortJa"});
            ioService.ausgabe(new String[]{"registrierung", "name"});
            userCharakter = new UserCharakter(ioService.antwortEinlesen());
            ioService.trennlinie();
            ioService.ausgabe("personalBegruesung"); // TODO Keine Namensausgabe
        } else {
            ioService.ausgabe(new String[]{"registrierung", "antwortNein"});
        }
        //--------

        ioService.ausgabe(new String[]{"charakter", "eigenschaften"});
        if (ioService.antwortEinlesen().contains("j") && userCharakter == null) {
            ioService.ausgabe("keinenChar");
            ioService.ausgabe(new String[]{"registrierung", "name"});
            userCharakter = new UserCharakter(ioService.antwortEinlesen());
        }
        assert userCharakter != null;
        userCharakter.schowEigenschaften();
        ioService.trennlinie();
        ioService.ausgabe(new String[]{"charakter", "setMotto"});
        userCharakter.setMotto(ioService.antwortEinlesen());
        ioService.ausgabe(new String[]{"charakter, mottoInfo"});
        ioService.trennlinie();
        ioService.ausgabe(new String[]{"locations", "intro"});
        System.out.print(userCharakter.getMotto());
    }
}