package de.hs_lu.o2s.tut4.exkurs;

public class Affe extends Tier {

	public Affe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double berechneGehege() {
		return this.getGewicht() * this.getGroesse() * 0.82;
		
	}
	
	
	
	
}
