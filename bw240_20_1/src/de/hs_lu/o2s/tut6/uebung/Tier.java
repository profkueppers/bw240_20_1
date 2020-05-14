package de.hs_lu.o2s.tut6.uebung;

public class Tier {

	private int groesse;
	private int gewicht;

	public Tier(int groesse) {
		this.groesse = groesse;
	}
	
	public Tier(int gewicht) {
		this.gewicht = gewicht;
	}
	
	public int getGroesse() {
		return groesse;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public void setGroesse(int groesse) {
		this.groesse = groesse;
	}
	
	
}
