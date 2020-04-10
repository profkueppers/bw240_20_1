package de.hs_lu.o2s.v5.personen;

public class Dozent extends Person {
	
	/**
	 * Besoldungsgruppe des Dozenten
	 */
	private String besoldungsgruppe;
	
	/**
	 * Konstruktor f�r einen Dozenten
	 * @param name Name
	 * @param besoldungsgruppe Besoldungsgruppe
	 */
	public Dozent(String name, String besoldungsgruppe){
		super(name);
		this.besoldungsgruppe = besoldungsgruppe;
	}
	
	/**
	 * Get-Methode f�r besoldungsgruppe
	 * @return Besoldungsgruppe des Dozenten
	 */
	public String getBesoldungsgruppe() {
		return besoldungsgruppe;
	}
	
	/**
	 * Set-Methode f�r besoldungsgruppe
	 * @param besoldungsgruppe Neue Besoldungsgruppe des Dozenten
	 */
	public void setBesoldungsgruppe(String besoldungsgruppe) {
		this.besoldungsgruppe = besoldungsgruppe;
	}
	
}
