package de.hs_lu.o2s.tut4.uebung;

public class Person {

	String vorname, nachname;
	Fahrzeugliste zugeordnete_fahrzeugliste;

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

	public Fahrzeugliste getZugeordnete_fahrzeugliste() {
		return zugeordnete_fahrzeugliste;
	}

	public void setZugeordnete_fahrzeugliste(Fahrzeugliste zugeordnete_fahrzeugliste) {
		this.zugeordnete_fahrzeugliste = zugeordnete_fahrzeugliste;
	}

}
