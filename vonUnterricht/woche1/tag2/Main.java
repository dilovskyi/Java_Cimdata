package org.vonUnterricht.woche1.tag2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String username;
		System.out.println("Wie heißt Du denn?");
		Scanner sc = new Scanner(System.in);

		username = sc.nextLine();

		System.out.println("Hallo " + username);
	}
}
