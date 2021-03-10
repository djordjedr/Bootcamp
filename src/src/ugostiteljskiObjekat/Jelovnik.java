package ugostiteljskiObjekat;

import java.util.List;

/*
Napraviti klasu Restoran koji sadrzi podatke o nazivu restorana i tipu kuhinje za koji je specijalizovan. Oba podatka mogu i da se dohvate i postave.
Napraviti klasu Jelovnik koji sadrzi kategorije jela (npr predjelo, glavno jelo, dezert…), naziv jela, listu sastojaka od kojih je jelo napravljeno i cenu obroka.

U glavnom programu testirati kako ove klase funkcionisu -> dodati sastojak u jelo, izbaciti sastojak, promeniti naziv jela,...
*/
public class Jelovnik {

	private String kategorijaJ;
	private String nazivJ;
	private List<String> sastojci;
	private double cena;
	
	public Jelovnik(String kategorijaJ, String nazivJ) {
		super();
		this.kategorijaJ = kategorijaJ;
		this.nazivJ = nazivJ;
	}

	public String getKategorijaJ() {
		return kategorijaJ;
	}

	public void setKategorijaJ(String kategorijaJ) {
		this.kategorijaJ = kategorijaJ;
	}

	public String getNazivJ() {
		return nazivJ;
	}

	public void setNazivJ(String nazivJ) {
		this.nazivJ = nazivJ;
	}

	public List<String> getSastojci() {
		return sastojci;
	}

	public void setSastojci(List<String> sastojci) {
		this.sastojci = sastojci;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	
}
