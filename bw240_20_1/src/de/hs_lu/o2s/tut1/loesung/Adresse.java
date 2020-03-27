package de.hs_lu.o2s.tut1.loesung;

public class Adresse {

	private String strasse, hnr;

	public Adresse(String strasse, String hnr) {
		this.strasse = strasse;
		this.hnr = hnr;
	}
	
	public String toString() {
		return strasse+' '+hnr;
	}
	
	

}
