package de.hs_lu.o2s.tut4.exkurs;

public class Katta extends Affe {
	
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

	public Katta() {
		// TODO Auto-generated constructor stub
	}
	
	
	//Berechnung der Bewertung = 
	//rückgabe von Multiplikator * rating
	
	public double berechnungBewertung() {
		return super.multiplikator() * this.getRating();
	}
	
	
	@Override
	public double multiplikator() {
		// TODO Auto-generated method stub
		return super.multiplikator();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
}
