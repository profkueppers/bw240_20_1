package de.hs_lu.o2s.tutorium.tut9.uebung;

import java.sql.Blob;
import java.util.ArrayList;

import de.hs_lu.o2s.tutorium.tut7.loesung.Person;

public class BesitzerList extends ArrayList {

	public BesitzerList() {
		super();
	}

	public boolean pruefBesitzerVorAdd(Object o) {
		return (o instanceof Person && ((Person) o).isFahrberechtigt() && !this.contains(o));
	}

	@Override
	public boolean add(Object e) {
		boolean retBool = this.pruefBesitzerVorAdd(e);
		if (retBool) {
			return super.add(e);
		}
		return retBool;
	}

	public boolean add(BesitzerList BList) {
		for (Object o : BList) {
			if (!this.pruefBesitzerVorAdd(o)) {
				return false;
			}
		}
		return super.add(BList);

	}

	public String checkFahrerlaubnisDerBesitzer() {
		String myString = "Folgende Besitzer wurden aus der Besitzerliste entfernt:";
		int vergleichInt = this.size();
		for (Object o : this) {
			if (o instanceof Person) {
				Person pruefPers = (Person) o;
				if (!(pruefPers.isFahrberechtigt())) {
					myString += pruefPers.toString() + "\n";
					this.remove(pruefPers);
				}
			}
		}
		if (this.size() == vergleichInt) {
			return "Es wurde niemand entfernt.";
		}
		return myString;
	}

	/**
	 * public String checkFahrerlaubnisDerBesitzer() { ArrayList entfernteFahrer =
	 * new ArrayList(); for (Object o1 : this) { if (!((Person)
	 * o1).isFahrberechtigt()) { entfernteFahrer.add(o1); this.remove(o1); } } if
	 * (entfernteFahrer.isEmpty()) return "Es wurde niemand entfernt.";
	 * 
	 * String myString = "Folgende Besitzer wurden aus der Besitzerliste entfernt:";
	 * for (Object o2 : entfernteFahrer) { myString += ((Person) o2).toString(); }
	 * return myString; }
	 **/

	/**
	 * 10 Objekt in Arraylist
	 * 
	 * Index 3, O
	 * 
	 * --> Alle anderen Einträge werden um 1 nach rechts verschoben. 0 1 2 3 4 5 6
	 * ...
	 */

	@Override
	public void add(int index, Object element) {
		if (this.pruefBesitzerVorAdd(element)) {
			super.add(index, element);
		}
	}
}
