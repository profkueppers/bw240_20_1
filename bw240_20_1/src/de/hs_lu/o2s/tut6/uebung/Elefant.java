package de.hs_lu.o2s.tut6.uebung;

public class Elefant extends Tier {

	public Elefant(int groesse) {
		super(groesse);
	}
	
	public Elefant(int groesse, int gewicht) {
		this(groesse);
		this.setGewicht(gewicht);
	}

	
	public void berechne(double multiplikator) {
		
	}
	
	public void berechne() {
		super.getGroesse();
	}
	
}
