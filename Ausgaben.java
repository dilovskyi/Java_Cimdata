package org;

import java.util.Map;

public class Ausgaben {

    public void gameGeschichte() {
        System.out.println("""
                ╔════════════════════════════════════════════╗
                ║     WILLKOMMEN AUF DER SCHLANGEN INSEL     ║
                ╚════════════════════════════════════════════╝
                
                Ein kalter Nebel liegt über dem Strand, als Du benommen die Augen öffnest.
                Du hast keine Erinnerung daran, wie Du hierhergekommen bist – nur das Tosen
                der Wellen und das entfernte Rufen fremder Stimmen.
                
                Eine seltsame Karte liegt in Deiner Tasche.
                Dein Abenteuer beginnt – **jetzt**.
                """);
    }

    public void wieHeisstDu() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Wie heißt du, Reisender?");
    }

    public void registrierung() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("""
                Bist du bereit, deinen Charakter zu erstellen?""");
    }


    public void jaNeinFragen(String frage) {
        System.out.println(frage);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void personalBegrüssung(String name) {
        System.out.printf("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~;
                Willkommen auf der Schlankeninsel, %s !
                Deine Reise beginnt am östlichen Strand.
                Vor dir erstreckt sich dichter Dschungel. Hinter dir liegt das endlose Meer.
                Du hast keine Wahl! Du musst dir Hilfe suchen!
                """, name);
    }

    // TODO Refactoring
    public void showEigenschaftenInfo(Map<String, Object> charInfoObj) {
        String name = (String) charInfoObj.get("name");
        int alter = (int) charInfoObj.get("alter");
        int lebenspunkte = (int) charInfoObj.get("lebenspunkte");
        int weisheit = (int) charInfoObj.get("weisheit");
        System.out.printf("""
                        Name: %s,
                        Alter: %d,
                        Lebenspunkte: %d,
                        Weisheit: %d\n""", name, alter, lebenspunkte,
                weisheit);
    }
}
