package org.unterrichtsnotizen.woche1.tag2;

public class Main {
	static String name = "Max";
	static String name2 = "Max Mustermann";

	public static void main(String[] args) {
		System.out.println(getLastElement(name));
		System.out.println(getLastElement(name2));
	}

	private static char getLastElement(String userInput) {
		return userInput.charAt((userInput.length() - 1));
	}
}
