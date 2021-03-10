package krizniStab;

import java.util.ArrayList;
import java.util.List;

/*
 * Napraviti klasu ClanKriznogStaba. Klasa sadrzi podatke o imenu, prezimenu, godini rodjenja 
 * i zanimanju clana kriznog staba. 
Napraviti listu krizniStab i u nju dodati doktora Kona, doktorku Kisic i doktora Nestorovica.
 Ispisati velicinu liste. Dohvatiti drugog clana liste.
Izmeniti mu zanimanje u ministarka. Izbaciti doktora Nestorovica iz liste. Ispisati velicinu
 liste.
 
 U klasi ClanKriznogStaba napraviti atribut tipa liste stringova koja predstavlja nazive omiljenih 
vakcina odredjenog doktora.

 */
public class ClanKriznogStaba {
	private String ime;
	private String prezime;
	private int godinaRodjenja;
	private String zanimanje;
	private Vakcine omiljenaVakcina;
	
	public ClanKriznogStaba (String ime,String prezime, int godinaRodjenja, String zanimanje, Vakcine omiljenaVakcina) {
		this.ime=ime;
		this.prezime=prezime;
		this.godinaRodjenja=godinaRodjenja;
		this.zanimanje=zanimanje;
		this.omiljenaVakcina=omiljenaVakcina;
		
	}

	public Vakcine getOmiljenaVakcina() {
		return omiljenaVakcina;
	}

	public void setOmiljenaVakcina(Vakcine omiljenaVakcina) {
		this.omiljenaVakcina = omiljenaVakcina;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}
}
