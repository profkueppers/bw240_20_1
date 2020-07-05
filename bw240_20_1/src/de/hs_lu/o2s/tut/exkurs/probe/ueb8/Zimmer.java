package de.hs_lu.o2s.tut.exkurs.probe.ueb8;

public class Zimmer {
	private int zimmerNummer;
	private int anzahlBetten;
	private int belegteBetten;

	public Zimmer(int zimmerNummer, int anzahlBetten) {
		this.anzahlBetten = anzahlBetten;
		this.belegteBetten = 0;
	}

	public int getzimmerNummer() {
		return zimmerNummer;
	}

	public void setzimmerNummer(int zimmerNummer) {
		zimmerNummer = zimmerNummer;
	}

	public int getAnzahlBetten() {
		return anzahlBetten;
	}

	public void setAnzahlBetten(int anzahlBetten) {
		this.anzahlBetten = anzahlBetten;
	}

	public int getBelegteBetten() {
		return belegteBetten;
	}

	public void setBelegteBetten(int belegteBetten) {
		this.belegteBetten = belegteBetten;
	}
}
