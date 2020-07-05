package de.hs_lu.o2s.tut.exkurs.ueb8;

public class AppTestMyArrayList {

	public static void main(String[] args) {

		MyArrayList<Henne> myAL = new MyArrayList<Henne>();

		myAL.add(new Henne("Anna"));
		myAL.add(new Henne("Emma"));
		myAL.add(new Henne("Irma"));
		Henne erna = new Henne("Erna");
		myAL.add(2, erna);

		System.out.println(myAL);

		myAL.remove(1);
		myAL.remove(erna);

		try {
			myAL.remove(5);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Kann an Stelle 5 nichts entfernen.");
		}

		myAL.clear();

	}
}
