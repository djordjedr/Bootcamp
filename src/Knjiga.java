

public class Knjiga {
	
	private String naslov;
	private Autor autor;
	private int brojProdatihPrimeraka;
	private int cena;
	
	public Knjiga(String naslov, Autor autor) {
		this.naslov = naslov;
		this.autor = autor;
	}
	
	public Autor getAutor() {
		return autor;
	}

	public String getNaslov() {
		return naslov;
	}

	public int getBrojProdatihPrimeraka() {
		return brojProdatihPrimeraka;
	}

	public void setBrojProdatihPrimeraka(int brojProdatihPrimeraka) {
		this.brojProdatihPrimeraka = brojProdatihPrimeraka;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}
	
	public int izracunajProfit(){
		return cena * brojProdatihPrimeraka;
	}
	
	public void setAutor(Autor a) {
		autor = a;
	}
	
}