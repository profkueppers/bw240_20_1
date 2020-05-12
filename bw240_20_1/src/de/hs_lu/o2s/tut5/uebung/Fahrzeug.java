package de.hs_lu.o2s.tut5.uebung;

public abstract class Fahrzeug {

	private String kennzeichen;

	public Fahrzeug() {
		
	}
	
	public Fahrzeug(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public String getKennzeichen() {
		return this.kennzeichen;
	}
	
	public abstract double verschleissBerechnen(int kilometer);
}
