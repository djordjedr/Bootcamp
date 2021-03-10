package nacija;

public class Drzava {
/*
 * Napraviti klasu grad koja sadrzi podatke o imenu, nadmorskoj visini i broju stanovnika.
 *  Napraviti klasu drzava koja sadrzi podatke o imenu i himni drzave. Uvezati ove dve klase i
 *   igrati se sa njima.
 */
	private String ime;
	private String himna;
	private Kontinent kontinent;

	public Drzava (String ime, String himna, Kontinent kontinent) {
		this.ime=ime;
		this.himna=himna;
		this.kontinent=kontinent;
	}

	public Kontinent getKontinent() {
		return kontinent;
	}

	public void setKontinent(Kontinent kontinent) {
		this.kontinent = kontinent;
	}

	public String getIme() {
		return ime;
	}

	public String getHimna() {
		return himna;
	}
	
	
	
	}


