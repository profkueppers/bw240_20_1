package de.hs_lu.o2s.tut2.loesung;

public class AppAuto {

	public static void main(String args[]) {
		Autoliste aL1 = new Autoliste();
		aL1.addAuto(new Auto("Mercedes", "E-Klasse", 1997));
		aL1.addAuto(new Auto("BMW", "3er", 2007));
		aL1.addAuto(new Auto("Opel", "Corsa", 2012));
		System.out.println(
				"--------------------------------Ausgabe der Autoliste---------------------------------------");
		System.out.println(aL1);
		System.out.println(
				"--------------------------------Ausgabe Auto welches gelöscht wurde---------------------------------------");
		System.out.println(aL1.deleteLastAuto());
		System.out.println(
				"--------------------------------Ausgabe der Autoliste nach Delete---------------------------------------");
		System.out.println(aL1);

		Autoliste aL2 = new Autoliste();
		aL2.addAuto(new Auto("Fiat", "Panda", 1993));
		aL2.addAuto(new Auto("Nissan", "Skyline", 1998));

		aL1.addAutoliste(aL2);
		System.out.println(
				"---------------------------------Ausgabe der Autoliste aL1 nach Hinzufügen von aL2---------------------------------------");
		System.out.println(aL1);
	}

}
