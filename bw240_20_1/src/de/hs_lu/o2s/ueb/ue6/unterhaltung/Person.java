package de.hs_lu.o2s.ueb.ue6.unterhaltung;

public class Person {

	/**
	 * Name der Person
	 */
	private String name;

	/**
	 * Geburtsjahr der Person
	 */
	private int geburtsjahr;

	/**
	 * Konstruktor fuer eine "leere" Person
	 */
	public Person() {
		super(); // dies kann auch weggelassen werden
	}

	/**
	 * Konstruktor fuer Person mit uebergebenem Name
	 * 
	 * @param name
	 *            Name der Person
	 */
	public Person(String name) {
		super();
		this.setName(name);
	}

	/**
	 * Konstruktor fuer Person mit uebergebenem Namen und Geburtsjahr
	 * 
	 * @param name
	 * @param geburtsjahr
	 */
	public Person(String name, int geburtsjahr) {
		super();
		this.setName(name);
		this.setGeburtsjahr(geburtsjahr);
	}

	public void druckDich() {
		System.out.println(this.toString());
	}

	public final String toPersonString() {
		String personString = this.getClass().getSimpleName() + " mit Name: " + this.getName() + " und Geburtsjahr: "
				+ this.getGeburtsjahr();
		return personString;
	}

	public String toString() {
		return this.toPersonString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(int geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}
}
