package de.hs_lu.o2s.tut2.loesung;


public class Autoliste {

	Auto[] autoA;

	public Autoliste() {
		autoA = new Auto[0];
	}

	public Auto[] getAutoA() {
		return autoA;
	}

	public void setAutoA(Auto[] autoA) {
		this.autoA = autoA;
	}

	/**
	 * Lösung addAuto
	 * 
	 * 1.) Kopie des Auto Arrays erstellen und um eins verlängern, weil wir einen
	 * neuen Eintrag im Array erwarten.
	 * 
	 * 2.) copyArray[0] = a weil es an der ersten Stelle des neuen Arrays eingefügt
	 * werden soll.
	 * 
	 * 3.) system.arraycopy, integrierte Java Funktion, die Arrays kopiert.
	 * System.arraycopy(src, srcPos, dest, destPos, length); src ==> source =
	 * Ursprung der Informationen scrPos ==> Startindex der Ursprungsinformationen
	 * dest ==> destination ==> Ziel der Information destPost ==> Zielindex, an dem
	 * gestartet werden soll length ==> Wie viele Einträge sollen kopiert werden?
	 * 
	 * 4.) this.autoA = copyArray --> Zuweisung des neuen Arrays auf das Array autoA
	 * der Autoliste
	 * 
	 */

	public boolean addAuto(Auto a) {
		Auto[] copyArray = new Auto[this.autoA.length + 1];
		copyArray[0] = a;
		System.arraycopy(this.autoA, 0, copyArray, 1, this.autoA.length);
		this.autoA = copyArray;
		return true;

	}

	/**
	 * Lösung getAnzahlAutos
	 * 
	 * Die Länge des Arrays wird zurückgegeben
	 * 
	 */

	public int getAnzahlAutos() {
		return this.autoA.length;
	}

	/**
	 * 
	 * Lösung deleteLastAuto 
	 * 
	 * Sehr ähnliche Logik wie in addAuto:
	 * Unterschiede hierbei ist die Länge beim Kopieren, diese beträgt lediglich eins weniger,
	 * da wir das letzte Auto aus dem Array Löschen
	 * 
	 * Wir müssen uns vor dem wegspeichern, das letzte Element, das wir löschen wollen merken,
	 * da wir das gemäß Aufgabenstellung zurückgeben müssen
	 * 
	 * 
	 */
	
	
	public Auto deleteLastAuto() {
		Auto [] copyArray = new Auto[this.autoA.length-1];
		Auto merker = this.autoA[autoA.length-1];
		System.arraycopy(this.autoA, 0, copyArray, 0, copyArray.length);
		this.autoA = copyArray;
		return merker;
		
	}
	
	
	/**
	 * Lösung addAutoListe(Autoliste autoL)
	 * 
	 * Sehr ähnliche Vorgehensweise wie bei den vorherigen Aufgaben, allerdings fügen
	 * wir jetzt nicht ein Auto hinzu oder löschen ein Auto, sondern fügen ein ganzes Array
	 * ein 
	 * 
	 * Detaillierte Erklärung:
	 * 
	 * this.autoA = [1] [2] [3] ==> Länge 3
	 * autoL.autoA = [4] [5] ==> Länge 2
	 * copyArray ==> [null][null][null][null][null] ==> Länge 5
	 * 
	 * Auto [] copyArray = new Auto [this.autoA.length + autoL.autoA.length];
	 * 
	 * System.arraycopy(this.autoA, 0, copyArray, 0, this.autoA.length);
	 * Starte von autoA Index 0 & Starte von copyArray Index 0 --> für Länge 3
	 * this.autoA = [1] [2] [3]
	 * copyArray = [1] [2] [3] [null] [null]
	 * 
	 * 
	 * System.arraycopy(autoL.autoA, 0, copyArray, this.autoA.length - 1, autoL.autoA.length);
	 * Starte von autoL.autoA Index 0 & Starte von copyArray bei Index 2 (Wichtig hier Array Index Beachten!) --> für Länge 2
	 * autoL.autoA = [4] [5]
	 * copyArray = [1] [2] [3] [4] [5]
	 * 
	 * Return true, wenn erfolgreich.
	 * 
	 */
	
	
	public boolean addAutoliste(Autoliste autoL) {
		Auto [] copyArray = new Auto [this.autoA.length + autoL.autoA.length];
		System.arraycopy(this.autoA, 0, copyArray, 0, this.autoA.length);
		System.arraycopy(autoL.autoA, 0, copyArray, this.autoA.length, autoL.autoA.length);
		this.autoA = copyArray;
		return true;
	}
	
	/**
	 * Lösung toString:
	 * 
	 * Es sollen alle Autos ausgegeben werden.
	 * 
	 * 
	 * 
	 * 
	 */
	public String toString() {
		String retString = "Alle Autos in der Autoliste:\n";
		
		for (int i = 0; i < this.getAnzahlAutos(); i++) {
			retString += this.autoA[i].toString();
		}
		return retString;
	
		
	}
	
	
	

}
