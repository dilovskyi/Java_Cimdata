package org.vonUnterricht.woche1.tag1;

public class Persone {
	String name;
	String nachname;
	int alter;
	String stadt;
	boolean onlineStatus;

	public Persone(String name, String nachname, Integer alter, String stadt, boolean status) {
		this.name = name;
		this.nachname = nachname;
		this.alter = alter;
		this.stadt = stadt;
		this.onlineStatus = status;
	}

}
