package de.hs_lu.o2s.tutorium.tut9.uebung;

public abstract class Fahrzeug {

	private String marke, modell;
	private double kilometerstand;
	private int ps;


	public Fahrzeug(String marke, String modell, double kmStand, int ps) {
		this.marke = marke;
		this.modell = modell;
		this.kilometerstand = kmStand;
		this.ps = ps;
	}

	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public double getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

}
