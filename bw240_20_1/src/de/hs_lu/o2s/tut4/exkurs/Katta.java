package de.hs_lu.o2s.tut4.exkurs;

public class Katta extends Affe {
	
	private double nahrungsmenge = 1.2;
	private double bewertung;
	private double rating = 2.4;
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getBewertung() {
		return bewertung;
	}

	public void setBewertung(double bewertung) {
		this.bewertung = bewertung;
	}

	
	public double getNahrungsmenge() {
		return nahrungsmenge;
	}

	public void setNahrungsmenge(double nahrungsmenge) {
		this.nahrungsmenge = nahrungsmenge;
	}

	public Katta() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Berechnung der Bewertung = 
	//rückgabe von Multiplikator * rating
	/**
	 * 
	 * Ist jetz Methode berechnungBewertung() in Katta Klasse : .....
	 * super.multiplikator()*this.getNahrungsmenge()* 
	 * this.getRating(); ???
	 * @return
	 */
	
	
	public void berechnungBewertung() {
		this.setBewertung(this.multiplikator() * this.getRating());
	}
	
	
	// gewicht * groesse * nahrungsmenge
	@Override
	public double multiplikator() {
		return super.multiplikator() * this.getNahrungsmenge();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
