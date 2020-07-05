package de.hs_lu.o2s.tut.exkurs.probe.ueb8;

import java.util.ArrayList;

public class Hotel<E> extends ArrayList<E> {

	@Override
	public String toString() {
		String gehoertZumHotel = "";
		String nichtZumHotel = "";

		for (E e : this) {
			if (e instanceof GehoertZumHotel) {
				gehoertZumHotel += e.toString()+"\n";
			} else {
				nichtZumHotel += e.toString()+"\n";
			}
		}
		String retString = gehoertZumHotel + nichtZumHotel;

		return retString;
	}
	
}
