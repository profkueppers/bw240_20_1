package de.hs_lu.o2s.tut4.exkurs;

public class zooApp {

	public static void main(String[] args) {
		Affe a1 = new Affe();
		Katta k1 = new Katta();
		Tier t1 =  new Tier();
		// Das kennen wir schon!
		t1.setGewicht(10);
		t1.setGroesse(35.2);
		System.out.println(t1.multiplikator());
		
		k1.setGewicht(8);
		k1.setGroesse(22.1);
		System.out.println(k1.multiplikator());

		
		
	}
	
}
