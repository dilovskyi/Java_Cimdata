package org.umgebung.umwelt;

import org.Eingaben;

import java.util.ArrayList;

public class Umwelt {
    private ArrayList<Ereignis> ereignisseArray = new ArrayList<Ereignis>(); // Create an ArrayList object
    private Standorte aktuellerStandort;

    public Umwelt() {
        this.aktuellerStandort = Standorte.STRAND;
    }

    public void respawn() {
        this.aktuellerStandort = Standorte.STRAND;
        System.out.println("Du bist am Anfang. Viel Glück!");
    }

    public void getAlleStandorte() {
        for (Standorte standort : Standorte.values()) {
            System.out.println(standort.ordinal() + " " + standort.name);
        }
    }


    private Standorte getAktuellerStandort() {
        return this.aktuellerStandort;
    }

    public void setAktuellerStandort(String userInput, Eingaben eingabeObj) {
        String userStandort = userInput.toUpperCase();

        for (Standorte ort : Standorte.values()) {
            //ort.name = String value
            //ort.nem = enum value()
            if (ort.toString().regionMatches(true, 0, userStandort, 0, 5) || Integer.parseInt(userStandort) == ort.ordinal()) {

                System.out.printf("Klasse! Du hast dich für %s entschieden. Bestätigen Sie bitte\n", ort);
                this.aktuellerStandort = eingabeObj.jaNeinAntwort() ? ort : this.aktuellerStandort;

            }
        }
        System.out.println("Aktueller Standort ist " + this.aktuellerStandort.name);

//        Standorte validatedUserInput = null;
//        try {
//            validatedUserInput = Standorte.valueOf(userInputStandort);
//        } catch (Throwable t) {
//            Logger.getAnonymousLogger().warning("Du bist ein schlechter Mensch");
//            System.out.println("Du darfst nicht");
//            throw t;
////            throw new RuntimeException("Du darfst nicht");
//        }


//        switch (userInputStandort) {
//            case Standorte.STRAND:
//                setStandort(richtung);
//                System.out.println("Du hast dich für Norden entschieden");
//                break;
//            case Standorte.DSCHUNGELRAND:
//                setStandort(richtung);
//                System.out.println("Du hast dich für Süden entschieden");
//                break;
//            case Standorte.DUNKLE_HOEHLE:
//                setStandort(richtung);
//                System.out.println("Du hast dich für Osten entschieden");
//                break;
//            case Standorte.GEHEIME_BUCHT:
//                setStandort(richtung);
//                System.out.println("Du hast dich für Westen entschieden");
//                break;
//            case Standorte.HAENGEBRUECKE:
//                System.out.println("Das Programm wird nun beendet");
//                break;
//            case Standorte.LAGERPLATZ:
//                System.exit(0);
//                System.out.println("Das Programm wird nun beendet");
//                break;
//            case Standorte.NEBELMOOR:
//                System.out.println("Das Programm wird nun beendet");
//                System.exit(0);
//                break;
//            case Standorte.VERFLUCHTER_TEMPEL:
//                System.out.println("Das Programm wird nun beendet");
//                System.exit(0);
//                break;
//            case Standorte.VERLASSENE_HUETTE:
//                System.out.println("Das Programm wird nun beendet");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Deine Eingabe war falsch ! Bitte wiederhole");
//                setAusgewaelteStandort(userInputStandort);
//        }
    }


    //Geschichten estellen
    public void setEreignis() {
        Ereignis ereignis = new Ereignis(); // erzeugen eine Geschichte
        ereignisseArray.add(ereignis); // spreichern
    }


}
