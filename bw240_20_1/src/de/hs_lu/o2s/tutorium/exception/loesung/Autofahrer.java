package de.hs_lu.o2s.tutorium.exception.loesung;

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

	/**
	 * Die Pr�fung, ob Person alt genug ist um zu fahren, �bernimmt die darfFuehrerscheinMachen Methode
	 * Siehe Kommentar dort.
	 */
	public void setAltGenugUmZuFahren() {
		this.AltGenugUmZuFahren = this.darfFuehrerscheinMachen();
	}
	/**
	 * Pr�fung, ob Person alt genug ist um den F�hrerschein zu machen
	 *  
	 * @return true --> Alt genug, false --> Zu jung
	 */
	public boolean darfFuehrerscheinMachen() {
		/**
		 * Falls nicht, wird eine Exception geworfen (NichtAltGenugEX)
		 */
		try {
			/**
			 * Pr�fung ob Alter gr��er 18 Jahre bzw. Geburtsjahr kleiner 2002
			 */
			if (this.getGeburtsjahr() < 2002) {
				System.out.println("Ich darf den F�hrerschein machen!");
				return true;
			}
			/**
			 * Falls zu jung, wird eine NichtAltGenugEX geworfen
			 */
			throw new NichtAltGenugException("Ich bin einfach noch zu jung!");

			/**
			 * Catch der NichtAltGenugException --> Ausgabe der msg per Konsole.
			 */
		} catch (NichtAltGenugException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}
}
