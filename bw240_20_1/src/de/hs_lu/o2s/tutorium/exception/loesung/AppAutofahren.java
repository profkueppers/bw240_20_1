package de.hs_lu.o2s.tutorium.exception.loesung;

public class AppAutofahren {

	public static void main(String args[]) {

		Auto a1 = new Auto("Mercedes", "C-Klasse", 130, new Autofahrer("Thilo Kehrer", true), 50000);
		Auto a2 = new Auto("BMW", "e30", 420, new Autofahrer("Tim Wiese", false), 220000);
		/**
		 * Wird versucht auszuführen!
		 */
		try {
			/**
			 * Wird keine Exception geworfen!
			 */
			a1.autoFahren(500);
			// msg?
			System.out.println("Der neue Kilometerstand beträgt " + a1.getKilometerstand());
			a2.autoFahren(1200);
			System.out.println("Der neue Kilometerstand beträgt " + a2.getKilometerstand());
			/**
			 * Wird nur ausgeführt, wenn eine Exception geworfen wird!
			 */
		} catch (KeinFuehrerscheinException e) {
			// TODO Auto-generated catch block
			/**
			 * Exception wird geworfen & gefangen und Nachricht wird ausgegeben!
			 */
			System.out.println(e.getMessage());
		
		/**
		 * Wird auf jeden Fall ausgeführt.
		 */
		} finally {
			Autofahrer Af0 = new Autofahrer("Oliver Kahn", false);
			a1.setFahrer(Af0);
			Autofahrer Af1 = new Autofahrer("Malik Tillmann", 2002);
			Af1.darfFuehrerscheinMachen();
			
		}

	}
}
