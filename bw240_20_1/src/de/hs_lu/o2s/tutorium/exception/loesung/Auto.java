package de.hs_lu.o2s.tutorium.exception.loesung;

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

	/**
	 * Aufgabenteil 2 - Exception
	 * 
	 * @param fahrer
	 */
	public void setFahrer(Autofahrer fahrer) {
		/**
		 * Try Block - Prüfen, ob es zu bekannten Fehlern bzw. Ausnahmen kommen kann
		 */
		try {
			/**
			 * Wenn Fahrer einen Führerschein hat, dann ist alles ok und er wird gesetzt
			 */
			if (this.getFahrer().hasFuehrerschein()) {
				this.fahrer = fahrer;
				/**
				 * Ansonsten wird eine Exception hierzu geworfen.
				 */
			} else {
				throw new KeinFuehrerscheinException(
						fahrer.getName() + " kann nicht gesetzt werden, weil er keinen Führerschein hat.");
			}
		} catch (KeinFuehrerscheinException e) {
			System.out.println(e.getMessage());
		}
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

	public void autoFahren(int zurueckgelegteKilometer) throws KeinFuehrerscheinException {
		if (this.getFahrer().hasFuehrerschein()) {
			this.setKilometerstand(this.getKilometerstand() + zurueckgelegteKilometer);
		} else {
			throw new KeinFuehrerscheinException(this.getFahrer().getName() + " hat momentan keinen Führerschein!");
		}
	}

}
