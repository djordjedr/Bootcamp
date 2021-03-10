
public class Zaposleni {
	/*
	 *Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se 
	 *postavi. Ispisati ceo objekat klase firma. Ispisati prezimena svih zaposlenih u firmi.
	Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja.
	 Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)

	Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

	 */
	private String ime;
	private String prezime;
	private String pozicija;
	private int mesecnaP;
	
	public Zaposleni(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public int getMesecnaP() {
		return mesecnaP;
	}
	public void setMesecnaP(int mesecnaP) {
		this.mesecnaP = mesecnaP;
	}
	
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(ime);
		sb.append("_");
		sb.append(prezime);
		sb.append(":");
		sb.append(pozicija);
		sb.append("(");
		sb.append(mesecnaP);
		sb.append(")");
		
		
		return sb.toString();
	}
	
	
}
