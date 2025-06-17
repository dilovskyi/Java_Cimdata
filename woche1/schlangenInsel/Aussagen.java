package org.woche1.schlangenInsel;

public class Aussagen {

	public void willkommenText() {
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

	public void personalBegrüssung(String name) {
		System.out.printf("""
				Willkommen auf der Schlankeninsel, %s !

				Deine Reise beginnt am östlichen Strand.
				Vor dir erstreckt sich dichter Dschungel. Hinter dir liegt das endlose Meer.
				Du hast keine Wahl! Du musst dir Hilfe suchen!
				""", name);
	}

	public void gameGeschichte(String str) {
		System.out.println(str);
	}
}
