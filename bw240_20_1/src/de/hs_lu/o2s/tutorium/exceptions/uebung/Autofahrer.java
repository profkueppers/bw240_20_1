package de.hs_lu.o2s.tutorium.exceptions.uebung;

public class Autofahrer extends Person {

	private boolean AltGenugUmZuFahren = false;

	public Autofahrer(String name, int geburtsjahr, boolean fuehrerschein, Auto auto) {
		super(name, geburtsjahr, fuehrerschein, auto);
		// TODO Auto-generated constructor stub
	}

	public Autofahrer(String name, boolean fuehrerschein, Auto auto) {
		super(name, fuehrerschein, auto);
		// TODO Auto-generated constructor stub
	}

	public Autofahrer(String name, boolean fuehrerschein) {
		super(name, fuehrerschein);
	}

	public Autofahrer(String name, int geburtsjahr) {
		super();
		this.setName(name);
		this.setGeburtsjahr(geburtsjahr);
	}

	public boolean isAltGenugUmZuFahren() {
		return AltGenugUmZuFahren;
	}

	public void setAltGenugUmZuFahren(boolean altGenug) {
		this.AltGenugUmZuFahren = altGenug;
	}
}
