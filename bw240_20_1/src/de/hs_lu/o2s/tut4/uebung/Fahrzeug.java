package de.hs_lu.o2s.tut4.uebung;

public class Fahrzeug {

	double max_geschwindigkeit;
	String kennzeichen;

	public double getMax_geschwindigkeit() {
		return max_geschwindigkeit;
	}

	public void setMax_geschwindigkeit(double max_geschwindigkeit) {
		this.max_geschwindigkeit = max_geschwindigkeit;
	}

	public String getKennzeichen() {
		return kennzeichen;
	}

	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName()+", mit Kennzeichen"+this.getKennzeichen()+"& max. "+this.getMax_geschwindigkeit()+" km/h.";
	}
}