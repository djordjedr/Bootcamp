import java.util.Arrays;

public class Firma {
/*
 *Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se 
 *postavi. Ispisati ceo objekat klase firma. Ispisati prezimena svih zaposlenih u firmi.
Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja.
 Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)

Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

 */
	private String naziv;
	private String sediste;
	private int PIB;
	private Zaposleni[]zaposleni;
	public Firma(String naziv, String sediste, int pIB,Zaposleni[]zaposleni) {
		this.naziv = naziv;
		this.sediste = sediste;
		PIB = pIB;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
	
	public Zaposleni[] getZaposleni() {
		return zaposleni;
	}
	
	public void setZaposleni(Zaposleni[] zaposleni) {
		this.zaposleni = zaposleni;
	}
	public String getSediste() {
		return sediste;
	}
	public int getPIB() {
		return PIB;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		
		sb.append("Ime firme je: \n");
		sb.append(naziv);
		sb.append("\n ");
		sb.append("Sediste firme je u:");
		sb.append(sediste);
		sb.append("\n ");
		sb.append("PIB firme je:");
		sb.append(PIB);
		sb.append("\n ");
		//sb.append(ispisZaposlenih(zaposleni));
		
		return sb.toString();
	}	
	public String ispisZaposlenih(Zaposleni[]zaposleni) {
		StringBuilder sb=new StringBuilder();
		sb.append("Prezimena zaposlenih su: ");
		sb.append("\n");
		for (int i=0;i<zaposleni.length;i++) {
			
			sb.append("\n");
			sb.append(zaposleni[i].getPrezime().toString());
			}
		return sb.toString();
	}
	
	
	
}
