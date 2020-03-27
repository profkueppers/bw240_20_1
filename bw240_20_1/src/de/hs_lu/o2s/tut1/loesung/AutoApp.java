package de.hs_lu.o2s.tut1.loesung;

public class AutoApp {

	public static void main(String[] args) {
		Auto a1 = new Auto();
		System.out.println(a1.toString());

		
		/**
		 * 
		 *  Hier kann bei euch ein Fehler auftreten, je nach dem wie der Konstruktor definiert wurde! 
		 *  
		 *  Die Reihenfolge der Parameter muss einfach angepasst werden.
		 */
		
		Auto a2 = new Auto(74.2,7.8,192000.27,"HD-AB-2019",new Person("Patrick","Vögele","08.01.1994"));
		System.out.println(a2.toString());
		
	
		
		
	}
}
	





