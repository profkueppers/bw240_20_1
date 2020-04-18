package de.hs_lu.o2s.v6.unterhaltung.comparable;

public class Disco implements Unterhaltend, Comparable {

	/**
	 * Anzahl der Personen, die in die Disko passen
	 */
	private int anzahlPersonen;
	
	/**
	 * Konstruktor f�r Diskotheken
	 * @param anzahlPersonen Anzahl Personen, die in die Disko passen
	 */
	public Disco(int anzahlPersonen) {
		super();
		this.anzahlPersonen = anzahlPersonen;
	}
	
	/**
	 * Getter f�r Anzahl Personen
	 * @return
	 */
	public int getAnzahlPersonen() {
		return anzahlPersonen;
	}

	/**
	 * Setter f�r Anzahl Personen
	 * @param anzahlPersonen
	 */
	public void setAnzahlPersonen(int anzahlPersonen) {
		this.anzahlPersonen = anzahlPersonen;
	}

	@Override
	public int getUnterhaltungswert() {
		return this.getAnzahlPersonen();
	}
	
	public String toString(){
		return "Disco f�r " + this.getAnzahlPersonen() + " G�ste " +
				"mit Unterhaltungswert " + this.getUnterhaltungswert();
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Unterhaltend) {
			int myWert = this.getUnterhaltungswert();
			int comparedToWert = ((Unterhaltend) o).getUnterhaltungswert();
			return myWert - comparedToWert;
		}
		else {
			return 1; // das �bergebene Objekt implementiert nicht Interface Unterhaltend
		}
	}

}

