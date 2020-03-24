package de.hs_lu.o2s.tut1.uebung;

public class Adressenliste {
	String[] strasseA = { "Aachener Straße", "Berliner Straße", "Chemnitzer Straße" };
	String[] hnrA = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };

	Adresse[][] adressenAA = new Adresse[strasseA.length][hnrA.length];

//  StrasseA
//	INDEX		Länge
//	[0][1][2] ==> 3!

	public Adressenliste() {
		for (int currentStreet = 0; currentStreet < strasseA.length; currentStreet++) {
			for (int currentHouseNumber = 0; currentHouseNumber < hnrA.length; currentHouseNumber++) {
				
				adressenAA[currentStreet][currentHouseNumber] = new Adresse(
																	strasseA[currentStreet],
																	hnrA[currentHouseNumber]
																			);
				
				System.out.println(adressenAA[currentStreet][currentHouseNumber]);
				
	// adressenAA[0][0] ==> Adressenobjekt ("Aachener Straße", "1")
				
				
			}
		}

	}
	
	public static void main(String[] args) {
		
		Adressenliste a1 = new Adressenliste();
		
	}

}
