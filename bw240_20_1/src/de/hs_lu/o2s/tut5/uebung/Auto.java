package de.hs_lu.o2s.tut5.uebung;

public class Auto extends Fahrzeug{

	int kilometerstand;

	public Auto(int kilometerstand, String kennzeichen) {
		super(kennzeichen);
		this.kilometerstand = kilometerstand;
	}

	@Override
	public double verschleissBerechnen(int kilometer) {
		return kilometer * 0.2;
	
	}
	
	
	
	
	
}
