package de.hs_lu.o2s.tut5.uebung;

public class app {

	public static void main(String[] args) {

		String [] strA = new String [12];
		int randomIndex = (int) (strA.length * Math.random());
		System.out.println(strA[randomIndex]);
		
	}

}
