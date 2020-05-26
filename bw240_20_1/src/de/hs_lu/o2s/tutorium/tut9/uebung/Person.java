package de.hs_lu.o2s.tutorium.tut9.uebung;

import java.util.Date;

public class Person {
	
	private String name;
	private Date geburtsTag;
	private boolean fahrberechtigt;
	
	public Person(boolean fahrberechtigt, Date geburtsTag) {
		this.fahrberechtigt = fahrberechtigt;
		this.geburtsTag = geburtsTag;
	}

	public boolean isFahrberechtigt() {
		return fahrberechtigt;
	}

	public void setFahrberechtigt(boolean fahrberechtigt) {
		this.fahrberechtigt = fahrberechtigt;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGeburtsTag(Date geburtsTag) {
		this.geburtsTag = geburtsTag;
	}

	public Date getGeburtsTag() {
		return geburtsTag;
	}

	public String toString() {
		String myString = "Person mit Namen"+this.getName()+" hat am "+this.getGeburtsTag()+" Geburtstag";
		if(this.fahrberechtigt) {
			return myString + " und ist farberechtigt.";
		} else return myString + " und ist nicht fahrberechtigt.";
	}
	
	
	

}
