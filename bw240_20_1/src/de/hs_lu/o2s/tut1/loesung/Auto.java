package de.hs_lu.o2s.tut1.loesung;

public class Auto {

	double tankinhalt, verbrauch, kilometerstand;
	String kennzeichen;
	Person besitzer;

	public Auto() {
		System.out.println("Achtung, es wurde ein Standardkonstruktor verwendet!");
	}

	public Auto(double tankinhalt, double verbrauch, double kilometerstand, String kennzeichen) {
		super();
		this.tankinhalt = tankinhalt;
		this.verbrauch = verbrauch;
		this.kilometerstand = kilometerstand;
		this.kennzeichen = kennzeichen;
	}

	public Auto(double tankinhalt, double verbrauch, double kilometerstand, String kennzeichen, Person besitzer) {
		this.tankinhalt = tankinhalt;
		this.verbrauch = verbrauch;
		this.kilometerstand = kilometerstand;
		this.kennzeichen = kennzeichen;
		this.besitzer = besitzer;
	}

	public double getTankinhalt() {
		return tankinhalt;
	}

	public void setTankinhalt(double tankinhalt) {
		this.tankinhalt = tankinhalt;
	}

	public double getVerbrauch() {
		return verbrauch;
	}

	public void setVerbrauch(double verbrauch) {
		this.verbrauch = verbrauch;
	}

	public double getKilometerstand() {
		return kilometerstand;
	}

	public void setKilometerstand(double kilometerstand) {
		this.kilometerstand = kilometerstand;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}

	public Person getBesitzer() {
		return besitzer;
	}

	public void setBesitzer(Person besitzer) {
		this.besitzer = besitzer;
	}

	public String toString() {
		if (getKennzeichen() == null || getBesitzer() == null) {
			return "Auto ist nicht zugelassen";
		}
		return "Kilometerstand: " + getKilometerstand() + '\n' + "Verbrauch: " + getVerbrauch() + " / 100km\n"
				+ "Kennzeichen: " + getKennzeichen() + "\n" + "Besitzer: " + besitzer.getVorname() + " "
				+ besitzer.getNachname();
	}

}
