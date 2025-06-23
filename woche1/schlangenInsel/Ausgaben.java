package org.woche1.schlangenInsel;

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

	public void registrierung() {
		System.out.println("Bist du bereit, deinen Charakter zu erstellen?");
	}

	public void personalBegrüssung(String name) {
		System.out.printf("""
				Willkommen auf der Schlankeninsel, %s !

				Deine Reise beginnt am östlichen Strand.
				Vor dir erstreckt sich dichter Dschungel. Hinter dir liegt das endlose Meer.
				Du hast keine Wahl! Du musst dir Hilfe suchen!
				""", name);
	}

	public void showEigenschaftenInfo(Map<String, Object> charInfoObj) {
		// String name = charInfoObj.get("name");
		// int alter = charInfoObj.get("alter");
		// int lebenspunkte = charInfoObj.get("lebenspunkte");
		// int weisheit = charInfoObj.get("weisheit");
		// String str = String.format("""
		// Name: %s,
		// Alter: %d,
		// Lebenspunkte: %d,
		// Lebenserfahrung: %d\n""", name, alter, lebenspunkte,
		// weisheit);
		System.out.println(charInfoObj.get("name"));
	}

}
