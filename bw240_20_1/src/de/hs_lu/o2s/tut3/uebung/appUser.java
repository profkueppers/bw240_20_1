package de.hs_lu.o2s.tut3.uebung;

public class appUser {
	
	public static void main(String[] args) {
		user [] userA = new user [10];
		String [] passwordA = {"123456","123456789","10111213","ABCDEFG","123456","123456789","10111213","ABCDEFG","askldjnqwöldkihuihw","123"};
		for (int i = 0; i < userA.length; i++) {
			userA[i] = new user("user", passwordA[i]);
		}
		userListe uL1 =  new userListe(userA);
		
	}

}
