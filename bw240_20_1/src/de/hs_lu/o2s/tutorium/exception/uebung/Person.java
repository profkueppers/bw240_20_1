package de.hs_lu.o2s.tutorium.exception.uebung;

public abstract class Person {

	private String name;
	private int geburtsjahr;
	private boolean fuehrerschein;
	private Auto auto;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean hasFuehrerschein() {
		return fuehrerschein;
	}

	
	
	public void setFuehrerschein(boolean fuehrerschein) {
		this.fuehrerschein = fuehrerschein;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Person() {
		super();
	}
	
	public Person(String name, int geburtsjahr, boolean fuehrerschein, Auto auto) {
		this.name = name;
		this.fuehrerschein = fuehrerschein;
		this.auto = auto;
		this.geburtsjahr = geburtsjahr;
	}

	
	public Person(String name, boolean fuehrerschein, Auto auto) {
		this.name = name;
		this.fuehrerschein = fuehrerschein;
		this.auto = auto;
	}

	public Person(String name, boolean fuehrerschoen) {
		this.name = name;
		this.fuehrerschein = fuehrerschoen;

	}

}
