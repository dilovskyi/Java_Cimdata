package org.inselTextSpiel.services;

import java.util.Scanner;

public class IOService {
    final static private Scanner scanner = new Scanner(System.in);

    public static void ausgabe(String path, String... keys) {
        System.out.println(JsonParser.getValue(path, keys));
    }

    public static String antwortEinlesen() {
        return scanner.nextLine().trim().toLowerCase();
    }

    public static void trennlinie() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
