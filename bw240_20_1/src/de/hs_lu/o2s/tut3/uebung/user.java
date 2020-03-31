package de.hs_lu.o2s.tut3.uebung;

public class user {

	private String username, password;

	public user(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * changePassword Methode bekommt newPassword übergeben und hat min 8 Zeichen
	 * 
	 */

	public boolean changePassword(String newPassword) {
		if (this.changePassword(newPassword)) {
			this.setPassword(newPassword);
			return true;
		} else {
			System.out.println("Passwort zu kurz.");
			return false;
		}
	}

	public boolean checkPassword(String newPassword) {
		return (newPassword.length() >= 8) ? true : false;

	}

}
