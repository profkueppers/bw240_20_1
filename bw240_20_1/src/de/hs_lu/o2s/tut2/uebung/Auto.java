package de.hs_lu.o2s.tut2.uebung;

public class Auto {

	private String marke, modell;
	private int baujahr;

	public Auto(String marke, String modell, int baujahr) {
		super();
		this.marke = marke;
		this.modell = modell;
		this.baujahr = baujahr;
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

	public int getBaujahr() {
		return baujahr;
	}

	public void setBaujahr(int baujahr) {
		this.baujahr = baujahr;
	}

	public String toString() {
		return "Auto:\nMarke: " + this.getMarke() + "\nModell: " + this.getModell() + "\nBaujahr: "
				+ this.getBaujahr()+"\n";
	}

}
