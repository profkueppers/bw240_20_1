package de.hs_lu.o2s.tut4.exkurs;

public class ueubungsaufgabe {

	int geburtsjahr;
	boolean berufstaetig;
	String vorname, nachname, beruf;
	Adresse adresse;
	
	
	public String toString() {
		if (this.geburtsjahr > 1900 && this.berufstaetig == true)

			return this.vorname + " " + this.nachname + "\nBeruf :  " + this.beruf + "\nGeboren im Jahr : "
					+ this.geburtsjahr + "\nAdresse : " + this.adresse;

		if (this.geburtsjahr > 1900 && this.berufstaetig == false)
			return this.vorname + " " + this.nachname + "\nBeruf : Person ist nicht berufstätig "
					+ "\nGeboren im Jahr : " + this.geburtsjahr + "\nAdresse : " + this.adresse;

		if (this.geburtsjahr < 1900 && this.berufstaetig == true)
			return this.vorname + " " + this.nachname + "\nBeruf :  " + this.beruf + "\nAdresse : " + this.adresse;

		else // (this.geburtsjahr<1900 && this.berufstaetig==false)
			return this.vorname + " " + this.nachname + "\nBeruf : Person ist nicht berufstätig " + "\nAdresse : "
					+ this.adresse;
	}


	public int getGeburtsjahr() {
		return geburtsjahr;
	}


	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}


	public boolean isBerufstaetig() {
		return berufstaetig;
	}


	public void setBerufstaetig(boolean berufstaetig) {
		this.berufstaetig = berufstaetig;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getNachname() {
		return nachname;
	}


	public void setNachname(String nachname) {
		this.nachname = nachname;
	}


	public String getBeruf() {
		return beruf;
	}


	public void setBeruf(String beruf) {
		this.beruf = beruf;
	}


	public Adresse getAdresse() {
		return adresse;
	}


	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	

	
	
}
