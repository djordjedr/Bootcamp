package nacija;
/*
 * Napraviti klasu grad koja sadrzi podatke o imenu, nadmorskoj visini i broju stanovnika.
 *  Napraviti klasu drzava koja sadrzi podatke o imenu i himni drzave. Uvezati ove dve klase i
 *   igrati se sa njima.
 */
public class Grad {
	private String ime;
	private int nadmorskaVisina;
	private int brojStanovnika;
	private Drzava drzava;
	
	public Grad (String ime, int nadmorskaVisina, int brojStanovnika,Drzava drzava) {
		this.brojStanovnika=brojStanovnika;
		this.nadmorskaVisina=nadmorskaVisina;
		this.brojStanovnika=brojStanovnika;
		this.drzava=drzava;
		this.ime=ime;
	}

	

	public Drzava getDrzava() {
		return drzava;
	}



	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}



	public int getBrojStanovnika() {
		return brojStanovnika;
	}

	public void setBrojStanovnika(int brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}

	public String getIme() {
		return ime;
	}

	public int getNadmorskaVisina() {
		return nadmorskaVisina;
	}
	

}
