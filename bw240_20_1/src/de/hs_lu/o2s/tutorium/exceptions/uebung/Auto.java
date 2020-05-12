package de.hs_lu.o2s.tutorium.exceptions.uebung;

public class Auto {

	private String marke, modell;
	private int ps, kilometerstand;
	private Autofahrer fahrer;

	public String getMarke() {
		return marke;
	}

	public Autofahrer getFahrer() {
		return fahrer;
	}

	public void setFahrer(Autofahrer fahrer) {
		this.fahrer = fahrer;

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

	public int getPs() {
		return ps;
	}

	public void setPs(int ps) {
		this.ps = ps;
	}

	public Auto() {
		// TODO Auto-generated constructor stub
	}

	public Auto(String marke, String modell, int ps, Autofahrer fahrer, int kilometerstand) {
		this.marke = marke;
		this.modell = modell;
		this.ps = ps;
		this.fahrer = fahrer;
		this.kilometerstand = kilometerstand;
	}

	public int getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(int kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public void autoFahren(int zurueckgelegteKilometer) {
		if (this.getFahrer().hasFuehrerschein()) {
			this.setKilometerstand(this.getKilometerstand() + zurueckgelegteKilometer);
		}

	}

}
