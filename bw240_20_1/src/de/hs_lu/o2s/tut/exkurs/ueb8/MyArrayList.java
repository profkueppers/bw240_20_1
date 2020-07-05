package de.hs_lu.o2s.tut.exkurs.ueb8;

import java.util.ArrayList;

public class MyArrayList extends ArrayList {

	/**
	 * Überschreiben der add Methode gemäß Aufg. Stellung
	 */
	
	@Override
	public void add(int index, Object e) {
		// TODO Auto-generated method stub
		super.add(index, e);
		/**
		 * Aufruf priv. Hilfsmethode
		 * 
		 * @e Element, welches neu hinzugefügt wird
		 * @index Index des Elements
		 */
		this.printStatus(e, index);
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		boolean merken = super.add(e);
		/**
		 * Aufruf priv. Hilfsmethode
		 */
		this.printStatus(e, this.size() - 1);
		return merken;

	}

	public void printStatus(Object e, int index) {
		String printString = "Fuege " + e.toString() + " in die Liste an Position " + index + " ein.\n";
		printString += "Neue Listenlaenge: "+this.size()+"\n";
		
		for (Object o : this) {
			printString += "- "+o.toString()+"\n";
		}
		
		System.out.println(printString);
	}

}
