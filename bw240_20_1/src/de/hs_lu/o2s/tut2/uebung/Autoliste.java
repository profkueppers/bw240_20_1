package de.hs_lu.o2s.tut2.uebung;

public class Autoliste {

	Auto[] autoArray;

	public Autoliste() {
		autoArray = new Auto[0];
	}

	public Auto[] getAutoArray() {
		return autoArray;
	}

	public void setAutoArray(Auto[] autoA) {
		this.autoArray = autoA;
	}

	/**
	 * Bitte ab hier bearbeiten!
	 */
	
	// BEISPIEL
	//	INDEX	   0   1   2   = Länge 3            0   1   2   3  = Länge 4
	// autoArray {[1],[2],[3]} ==> neuesAutoArray {[a],[1],[2],[3]}
	
	
	public boolean addAuto(Auto a) {
		Auto [] copyArray = new Auto [autoArray.length + 1];
		copyArray[0] = a;
		
		/**
		for (int i = 0; i < autoArray.length; i++) {
			copyArray[i + 1] = autoArray[i];
		}
		*/
		
		
		/**
		 * src = Source =  Quelle - Wo kommt die Info her?
		 * srcPos = Source Position ==> Wo fangen wir in der Quelle an? (Index)
		 * dest = destination = Ziel ==> Was ist mein Ziel?
		 * destPos = Destination Position ==> Wo fangen wir im Ziel an? (Index)
		 * length = Länge ==> Wie oft wiederholen wir das und verschieben den Index?
		 */
		
		
		System.arraycopy(autoArray, 0, copyArray, 1, autoArray.length);
		
		
		autoArray = copyArray;
		return true;
		
		
		
	}
	
	
	public int getAnzahlAutos() {
		return autoArray.length;
	}
	
	// Beispiel
	// autoArray = [a],[b],[x] ==> copyArray [a][b] 
	// merkerDeleteAuto = x
	
	
	public Auto deleteLastAuto() {
		Auto [] copyArray = new Auto [autoArray.length - 1];
		Auto merkerDeleteAuto = autoArray[autoArray.length - 1];
		
		// merkderDeleteAuto = x
		//copyArray [null],[null]
		
		System.arraycopy(autoArray, 0, copyArray, 0, copyArray.length);
		
		//copyArray [a],[b]
		//autoArray [a],[b],[x]
		
		autoArray = copyArray;
		
		//autoArray [a],[b]
		
		return merkerDeleteAuto;
	}
	
}
