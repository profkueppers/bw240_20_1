package de.hs_lu.o2s.tut1.uebung;

public class Adresse {

	private String hnr, strasse;

	public Adresse( String strasse, String hnr) {
		this.hnr = hnr;
		this.strasse = strasse;
	}
	
	public String toString() {
		return strasse+ " "+hnr;
	}
	
}
