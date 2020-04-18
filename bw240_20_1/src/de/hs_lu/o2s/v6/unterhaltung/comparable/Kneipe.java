package de.hs_lu.o2s.v6.unterhaltung.comparable;

public class Kneipe implements Unterhaltend, Comparable {

	/**
	 * Bierpreis in der Kneipe Standardwert 2,40 Euro
	 */
	private float bierpreis = (float) 2.40;

	/**
	 * Angebotene Getr�nke in der Kneipe Standardauswahl Bier, Wein, Sekt
	 */
	private String[] getraenke = { "Bier", "Wein", "Sekt" };

	/**
	 * Konstruktor zum Anlegen einer Kneipe
	 * 
	 * @param bierpreis
	 *            Preis des Bieres in Euro
	 * @param getraenke
	 *            Getr�nkeliste der Kneipe
	 */
	public Kneipe(float bierpreis, String[] getraenke) {
		this.bierpreis = bierpreis;
		this.getraenke = getraenke;
	}

	@Override
	public int getUnterhaltungswert() {
		// je mehr Getr�nke es gibt desto besser UND
		// je weniger das Bier kostet desto besser
		double wert = getraenke.length / getBierpreis();

		// Skalierung (zur Vergleichbarkeit mit Diskotheken) und Casting auf int
		return 10 * (int) Math.floor(wert);
	}

	public String toString() {
		return "Kneipe mit " + this.getGetraenke().length + " Getr�nken, " + "Bierpreis " + this.getBierpreis()
				+ " und Unterhaltungswert " + this.getUnterhaltungswert();
	}

	public float getBierpreis() {
		return bierpreis;
	}

	public void setBierpreis(float bierpreis) {
		this.bierpreis = bierpreis;
	}

	public String[] getGetraenke() {
		return getraenke;
	}

	public void setGetraenke(String[] getraenke) {
		this.getraenke = getraenke;
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Unterhaltend) {
			int myWert = this.getUnterhaltungswert();
			int comparedToWert = ((Unterhaltend) o).getUnterhaltungswert();
			return myWert - comparedToWert;
		} else {
			return 1; // das �bergebene Objekt implementiert nicht Interface Unterhaltend
		}
	}

}
