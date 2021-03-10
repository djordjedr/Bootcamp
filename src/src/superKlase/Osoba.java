package superKlase;

public class Osoba {

	protected String ime;
	protected String prezime;
	protected int brojG;
	protected char pol;
	public Osoba(String ime, String prezime, int brojG, char pol) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brojG = brojG;
		this.pol = pol;
	}
	public int getBrojG() {
		return brojG;
	}
	public void setBrojG(int brojG) {
		this.brojG = brojG;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public char getPol() {
		return pol;
	}
	@Override
	public String toString() {
		return "Osoba [ime=" + ime + ", prezime=" + prezime + ", brojG=" + brojG + ", pol=" + pol + "]";
	}
	
	
}
