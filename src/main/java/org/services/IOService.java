package org.services;

import java.util.Scanner;

public class IOService {
    final private Scanner scanner = new Scanner(System.in);
    private JsonParser parser;

    public IOService(String pfad) {
        this.parser = new JsonParser(pfad);
    }

    public void ausgabe(String hauptKey) {
        System.out.println(this.getText(hauptKey));
    }

    public void ausgabe(String hauptKey, String innereKey) {
        System.out.println(this.getText(hauptKey, innereKey));
    }

    public void ausgabe(String[] keyArray) {
        System.out.println(this.getText(keyArray));
    }


    public String antwortEinlesen() {
        return scanner.nextLine().trim().toLowerCase();
    }

    public void trennlinie() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    private String getText(String hauptKey) {
        return parser.getText(hauptKey);
    }

    private String getText(String hauptKey, String innereKey) {
        return parser.getText(hauptKey, innereKey);
    }

    private String getText(String[] keyArray) {
        return parser.getText(keyArray);
    }

}
