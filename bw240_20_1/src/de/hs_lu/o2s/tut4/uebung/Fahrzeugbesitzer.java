package de.hs_lu.o2s.tut4.uebung;

public class Fahrzeugbesitzer extends Person{

	public Fahrzeugbesitzer() {
		
	}
	
	@Override
	public String toString() {
		String retString = super.toString()+ " hat folgende Fahrzeug:\n";
		for (int i = 0; i < this.getZugeordnete_fahrzeugliste().getFahrzeugList().length; i++) {
			retString += this.getZugeordnete_fahrzeugliste().getFahrzeugList()[i];
		}
		return retString;
		
		
		
	}
	
}
