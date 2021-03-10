package planinarenje;

import java.util.List;

/*
 * Planinar ima ime, prezime i zemlju porekla. Planinar moze da se penje
po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
opis planinara u obliku ime-zemlja porekla.
Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
neuspesno.Tekstualni oblik je K_ime-zemlja porekla.
Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-zemlja porekla.
*Napomena: Ukoliko je Alpinista A1 partner Alpinisti A2 onda je i Alpinista A2 partner Alpinisti
A1.
Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
planinar na nekoj odredjenoj poziciji u listi, moguce je da se doda/ukloni planinar. Takodje
moguce je ispisati sve planinare na planini u obliku [ime-zemlja porekla,ime-zemlja porekla,ime-zemlja porekla...]
 */
public class Planinar {
	private String ime;
	private String prezime;
	private String zemljaP;
	
	
	
	public Planinar(String ime, String prezime, String zemljaP) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zemljaP = zemljaP;
		
		
	}



	public String getIme() {
		return ime;
	}



	public void setIme(String ime) {
		this.ime = ime;
	}



	public String getPrezime() {
		return prezime;
	}



	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}



	public String getZemljaP() {
		return zemljaP;
	}



	public void setZemljaP(String zemljaP) {
		this.zemljaP = zemljaP;
	}
	
	
	
}
