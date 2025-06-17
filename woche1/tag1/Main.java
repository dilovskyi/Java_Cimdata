package org.woche1.tag1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen bei Text-Abenteuer!");
        System.out.println("Geben Sie Ihren Nickname ein");

        Charakter charakter = new Charakter(scanner.nextLine());

        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Ihre Character ist erstellt: ");
        charakter.getEigenschaften();

        System.out.println("Geben Sie Ihre Motto ein oder ENTER");
        charakter.setMotto(scanner.nextLine());
        System.out.println("Motto ist: " + charakter.getMotto());
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------");
    }
}
