package de.hs_lu.o2s.tut4.loesung2;

/**
 * toString Person:
<Person>: <Nachname>, <Vorname>

toString FahrzeugBesitzer:
<person.toString> hat folgende Fahrzeuge:
<Rückgabe aller Elemente der fahrzeugListe>
 * 
 * @author Patrick
 *
 */

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

	/**
	 * Aufgabenstellung:
	 * <Person>: <Nachname>, <Vorname>
	 */
	@Override
		public String toString() {
			return this.getClass().getSimpleName()+": "+this.getNachname()+", "+this.getVorname();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
