package de.hs_lu.o2s.tut4.exkurs;

public abstract class Tier{
	private static int tieranzahl = 0;
	
	String name;
	private int gewicht;
	private double groesse;

	
	public abstract double berechneGehege(); 
	
	
	public static int getTieranzahl() {
		return Tier.tieranzahl;
	}
	
	public Tier() {
		tieranzahl++;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGewicht() {
		return gewicht;
	}

	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}
	
	
	
	public double multiplikator() {
		return this.getGewicht() * this.getGroesse();
	}
	
	
	
	
	
	
	
	

}
