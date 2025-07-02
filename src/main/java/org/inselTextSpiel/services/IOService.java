package org.inselTextSpiel.services;

import java.util.Scanner;

public class IOService {
    final private Scanner scanner = new Scanner(System.in);
    private JsonParser parser;

    public IOService(JsonParser parser) {
        this.parser = parser;
    }

    public void ausgabe(String path, String... keys) {
        System.out.println(parser.getValue(path, keys));
    }

    public String antwortEinlesen() {
        return scanner.nextLine().trim().toLowerCase();
    }

    public void trennlinie() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
