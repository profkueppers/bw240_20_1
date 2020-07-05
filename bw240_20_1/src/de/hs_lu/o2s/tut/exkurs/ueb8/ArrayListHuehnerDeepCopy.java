package de.hs_lu.o2s.tut.exkurs.ueb8;

import java.util.ArrayList;

// Aufgabe 3
public class ArrayListHuehnerDeepCopy extends ArrayList<Henne> {

	public String toString() {
		String str = "";
		
		for(Henne h: this) {
			str += h.toString() + "\n";
		}
		
		return str;
	}

	// in dieser Klasse muessen Sie die clone-Methode ueberschreiben
	
	
}
