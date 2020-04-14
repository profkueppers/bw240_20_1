package de.hs_lu.o2s.tut4.uebung;

public class Fahrzeugliste {

	Fahrzeug[] fahrzeugList;

	public Fahrzeugliste() {
		// TODO Auto-generated constructor stub

		this.fahrzeugList = new Fahrzeug[0];
	}

	public Fahrzeug[] getFahrzeugList() {
		return fahrzeugList;
	}

	public void setFahrzeugList(Fahrzeug[] fahrzeugList) {
		this.fahrzeugList = fahrzeugList;
	}

	public boolean addFahrzeug(Fahrzeug f) {
		Fahrzeug[] copyArray = new Fahrzeug[this.getFahrzeugList().length + 1];
		System.arraycopy(this.getFahrzeugList(), 0, copyArray, 0, this.getFahrzeugList().length);
		copyArray[this.getFahrzeugList().length + 1] = f;
		
		//this.fahrzeugList = copyArray;
		this.setFahrzeugList(copyArray);
		System.out.println("Folgendes Fahrzeug wurde der Fahrzeugliste hinzugefügt: "+f.toString());
		return true;
	}
	
	
	public void addFahrzeugListe(Fahrzeugliste fL) {
		for (int i = 0; i < fL.getFahrzeugList().length; i++) {
			this.addFahrzeug(fL.getFahrzeugList()[i]);
		}
	}
	
	public boolean delFahrzeug(int pos) {
		
		Fahrzeug merkFahrzeug = this.getFahrzeugList()[pos];
		//[][][X][][]
		
		Fahrzeug[] copyArray = new Fahrzeug [this.getFahrzeugList().length - 1];
		
		
		
		
		
		
		System.out.println("Folgendes Fahrzeug wurde aus der Fahrzeugliste entfernt: "+merkFahrzeug.toString());
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
