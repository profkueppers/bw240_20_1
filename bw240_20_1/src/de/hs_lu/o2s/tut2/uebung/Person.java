package de.hs_lu.o2s.tut2.uebung;

public class Person {
	
	private String vorname, nachname, geburtsjahr;

	public Person(String vorname, String nachname, String geburtsjahr) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsjahr = geburtsjahr;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(String geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
	
	



}
