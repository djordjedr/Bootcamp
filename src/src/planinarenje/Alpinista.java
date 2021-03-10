package planinarenje;
/*
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

import java.util.List;

public class Alpinista extends Planinar {
	private Alpinista partner;

	public Alpinista(String ime, String prezime, String zemljaP) {
		super(ime, prezime, zemljaP);
		this.partner=partner;
		// TODO Auto-generated constructor stub
	}

	public Alpinista getPartner() {
		return partner;
	}

	public void setPartner(Alpinista partner) {
		
		if 
		this.partner = partner;
	}

}
