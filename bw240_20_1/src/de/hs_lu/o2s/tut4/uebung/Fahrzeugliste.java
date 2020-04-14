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

		// this.fahrzeugList = copyArray;
		this.setFahrzeugList(copyArray);
		System.out.println("Folgendes Fahrzeug wurde der Fahrzeugliste hinzugefügt: " + f.toString());
		return true;
	}

	public void addFahrzeugListe(Fahrzeugliste fL) {
		for (int i = 0; i < fL.getFahrzeugList().length; i++) {
			this.addFahrzeug(fL.getFahrzeugList()[i]);
		}
	}

	public boolean delFahrzeug(int pos) {

		Fahrzeug merkFahrzeug = this.getFahrzeugList()[pos];
		// this.getFahrzeugliste()
		// X
		// [0][1][2][3][4]
		//
		// copyArray
		// [0][1][2][3]
		Fahrzeug[] copyArray = new Fahrzeug[this.getFahrzeugList().length - 1];

		// Kopieren der Elemente bis zur Position die wir übergeben bekommen haben.
		System.arraycopy(this.getFahrzeugList(), 0, copyArray, 0, pos);
		// Kopieren der Elemente ab Position + 1, weil wir das merkerFahrzeug
		// überspringen möchten.
		System.arraycopy(this.getFahrzeugList(), pos + 1, copyArray, pos, this.getFahrzeugList().length - pos);

		System.out.println("Folgendes Fahrzeug wurde aus der Fahrzeugliste entfernt: " + merkFahrzeug.toString());
		return true;
	}

	public boolean checkPKW() {
		for (int i = 0; i < this.getFahrzeugList().length; i++) {
			//Prüfung, ob eine Instanz von PKW in der Fahrzeugliste beinhaltet ist. Falls ja, wird true zurückgegeben
			if (this.getFahrzeugList()[i] instanceof PKW) {
				return true;
			}
		}
		//Falls nicht, wird false returned.
		return false;
	}
	
	//Entfernen aller PKW im Array.
	public boolean delPKW_All() {
		//Iteration über alle PKWs
		for (int i = 0; i < this.getFahrzeugList().length; i++) {
			//Prüfung, ob aktuelles Element Instanz von PKW
			if(this.getFahrzeugList()[i] instanceof PKW) {
				//Wenn ja, nutze Index und delFahrzeug Methode, um Fahrzeug aus dem Array zu entfernen.
				this.delFahrzeug(i);
			}
		}
		return true;
		
	}

	
	
	
	
	
	
	
}
