package de.hs_lu.o2s.tut.exkurs.ueb8;

import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {

	/**
	 * Überschreiben der add Methode gemäß Aufg. Stellung
	 */
	
	@Override
	public void add(int index, E e) {
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
	public boolean add(E e) {
		// TODO Auto-generated method stub
		boolean merken = super.add(e);
		/**
		 * Aufruf priv. Hilfsmethode
		 */
		this.printStatus(e, this.size() - 1);
		return merken;

	}

	public void printStatus(E e, int index) {
		String printString = "Fuege " + e.toString() + " in die Liste an Position " + index + " ein.\n";
		printString += "Neue Listenlaenge: "+this.size()+"\n";
		
		for (Object o : this) {
			printString += "- "+o.toString()+"\n";
		}
		
		System.out.println(printString);
	}

	@Override
	public E remove(int index) {
		/**
		 * Print Status Remove Methode für das Objekt und für den Index
		 */
		this.printRemoveStatus(this.get(index), index);
		return super.remove(index);
	}
	
	@Override
	public boolean remove(Object o) {
		/**
		 * Print Status Remove Methode für das Objekt und für den Index mithilfe von IndexOf
		 */
		this.printRemoveStatus(o, this.indexOf(o));
		return super.remove(o);
	}

	public void printRemoveStatus(Object o, int index) {
		System.out.println("Entferne "+o.toString()+" aus Liste an bisheriger Position "+index+".\n");
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		super.clear();
		this.printClearStatus();
		
	}
	
	public void printClearStatus() {
		System.out.println("Leere Liste mit Laenge "+this.size());
	}
}
