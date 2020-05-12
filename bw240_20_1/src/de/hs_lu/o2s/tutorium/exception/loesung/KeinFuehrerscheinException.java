package de.hs_lu.o2s.tutorium.exception.loesung;

class KeinFuehrerscheinException extends Exception {

	private String msg = "";
	
	public KeinFuehrerscheinException() {
		// TODO Auto-generated constructor stub
	}
	
	public KeinFuehrerscheinException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return this.msg;
	}
	
	
}
