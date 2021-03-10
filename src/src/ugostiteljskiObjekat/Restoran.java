package ugostiteljskiObjekat;
/*
 * Napraviti klasu Restoran koji sadrzi podatke o nazivu restorana i tipu kuhinje za koji je 
 * specijalizovan. Oba podatka mogu i da se dohvate i postave.
Napraviti klasu Jelovnik koji sadrzi kategorije jela (npr predjelo, glavno jelo, dezert…),
 naziv jela, listu sastojaka od kojih je jelo napravljeno i cenu obroka.

U glavnom programu testirati kako ove klase funkcionisu -> dodati sastojak u jelo, izbaciti
 sastojak, promeniti naziv jela,...

 */
public class Restoran {
	private String nazivR;
	private String tipKuhinje;
	
	public Restoran(String nazivR, String tipKuhinje) {
		super();
		this.nazivR = nazivR;
		this.tipKuhinje = tipKuhinje;
	}
	public String getNazivR() {
		return nazivR;
	}
	public void setNazivR(String nazivR) {
		this.nazivR = nazivR;
	}
	public String getTipKuhinje() {
		return tipKuhinje;
	}
	public void setTipKuhinje(String tipKuhinje) {
		this.tipKuhinje = tipKuhinje;
	}
	

}
