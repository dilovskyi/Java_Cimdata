package org.vonUnterricht.woche1.tag3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// int wiederholungenInsgesamt = rundenRechner(10, 12);
		fürWilson();
	}

	public static void fürWilson() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Es gibt zwei Wege:");
		System.out.println("Lang und sicher → tippe 'lang'");
		System.out.println("Kurz und schwierig → tippe 'kurz'");
		String weg = scanner.nextLine();

		if (weg.equalsIgnoreCase("lang")) {
			System.out.println("Du gehst langsam, aber sicher durch den Wald.");
		} else if (weg.equalsIgnoreCase("kurz")) {
			System.out.println("Du kämpfst dich durch den schwierigen Pfad!");
		} else {
			System.out.println("Ungültige Eingabe.");
		}
		System.out.println("\nUnd vergiss nicht, deine verdammten Plastikflaschen wieder mitzunehmen!");

		boolean genugWasser = false;
		while (!genugWasser) {
			System.out.println("Wie viele Flaschen hast du jetzt?");
			Integer flaschenText = Integer.valueOf(scanner.nextLine());
			if (flaschenText == 2) {
				System.out.println("Super! Du bist bereit für das Abenteuer.");

				genugWasser = true;
			} else if (flaschenText < 2) {
				System.out.println("Du brauchst noch eine Flasche. Geh zum Fluss und füll sie auf.");
				genugWasser = false;
			} else {
				System.out.println("Du hast genug Wasser, du  kannst du x weitergehen.");
				break;
			}
		}
		scanner.close();
	}

	public static int rundenRechner(int rundenAnzahl, int liegentützeAnzahl) {
		int counter = 0;
		// Runde
		for (int r = rundenAnzahl; r > 0; r--) {
			// Liegestütze
			for (int l = liegentützeAnzahl; l > 0; l--) {
				counter++;
			}

			System.out.printf("""
					Du hast insgesamt %d Liegestütze gemacht.
					Es ist noch %d Runden übrig geblieben.
					Weiter machen!
					____________________________________________
					""", counter, r);
		}
		System.out.println("Du hast es geschafft!");
		return counter;
	}
}
