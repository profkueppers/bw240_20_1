package de.hs_lu.o2s.tut3.uebung;

public class userListe {
	
	user [] userA;

	public user[] getUserA() {
		return userA;
	}

	public void setUserA(user[] userA) {
		this.userA = userA;
	}
	
	public userListe(user [] userA) {
		this.userA = userA;
	}
	
	/**
	 * Methode zur Bestimmung der durchschnittlichen Passwortlänge unserer Nutzer
	 */
	/**
	 * 1. Password = 6
	 * 2. Password = 10
	 * 3. Password = 7
	 * 
	 * gesamtPasswortLaenge = 23
	 * 
	 * return gesamtPasswortLaenge / userA.length(3)
	 * @return
	 */
	public double avgPasswordLength() {
		// Hier wird Double verwendet, weil wir das integer abschneiden umgehen wollen
		double gesamtPasswortLaenge = 0;
		for (int i = 0; i < userA.length; i++) {
			gesamtPasswortLaenge += userA[i].getPassword().length();
		}	
		return gesamtPasswortLaenge / userA.length; 
		//int Berechnung = 8.0
		//double Berechnung = 8.2
	}
	
	
	
}
