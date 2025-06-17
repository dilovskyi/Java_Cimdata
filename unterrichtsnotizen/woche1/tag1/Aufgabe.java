package org.unterrichtsnotizen.woche1.tag1;

import java.util.Scanner;

public class Aufgabe {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Hinter uns ist einen Strand

		// To Do Input Stream;
		String willkommenText = "Hallo liebe(-r) ";

		// TODO in Charakter class verschieben
		int userBalance = (int) Math.round((Math.random() * 100) + 1);
		int befundKosten = 0;

		// Enum passt besser;
		String richtung1 = "norden";
		String richtung2 = "süden";
		String richtung3 = "westen";
		String richtung4 = "osten";
		String userRichtung = " ";

		System.out.println("Geben Sie einen Nickname ein");

		// TODO in Charakter class verschieben
		String userName = scanner.nextLine();
		System.out.println(willkommenText + userName);
		System.out.println("Deine Balance: " + userBalance);

		System.out.println("-------------------------------------------------------------------");
		System.out.println("Wohin möchtest du denn? Du hast die Wahl zwischen:");
		System.out.println(richtung1 + " " + richtung2 + " " + richtung3 + " " + richtung4);
		System.out.println("-------------------------------------------------------------------");

		// TODO in Umbebung class verschieben
		userRichtung = scanner.nextLine();
		System.out.println("Cool, du hast " + userRichtung + " gewählt");

		switch (userRichtung.toLowerCase()) {
		case "norden":
			befundKosten = (int) Math.round((Math.random() * 100) + 1);
			userBalance += befundKosten;
			System.out.println("Glückwunsch! Du hast eine Schatztruhe am Wegensrand gefunden " + befundKosten);
			System.out.println("Dein Balance beträgt jetzt " + userBalance);
			break;
		default:
			System.out.println("Geben Sie relevante Richtung!");
			break;
		}
	}
}
