package automobiliKlase;

import java.util.Scanner;

/*
 * vozilo  - Napisati klasu Automobil. Automobil ima 
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku     
   Napisati klasu Voznja iz koje ce program moci da se pokrene. 
U njoj ce se kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
 */

public class Automobil {

	private String marka;
	private String model;
	private int serijskiBroj;
	// private String [] vlasnik;
	private String vlasnik1;
	private String vlasnik2;
	private String vlasnik3;
	private String vlasnik4;

	public Automobil(String marka, String model, int serijskiBroj) {

		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
		// this.vlasnik=vlasnik;

	}

	/*
	 * }
	 * 
	 * public void setVlasnik () { Scanner sc=new Scanner(System.in); for (int i=0;
	 * i<3; i++) { System.out.println("Unesite " + (i+1) + ". vlasnika"); vlasnik
	 * [i]=sc.nextLine();
	 * 
	 * }
	 */
	public String getVlasnik1() {
		return vlasnik1;
	}

	public void setVlasnik1(String vlasnik1) {

		this.vlasnik1 = vlasnik1;
	}

	public void setVlasnik2(String vlasnik2) {
		this.vlasnik2 = vlasnik2;
	}

	public void setVlasnik3(String vlasnik3) {
		this.vlasnik3 = vlasnik3;
	}

	public void setVlasnik4(String vlasnik4) {
		this.vlasnik4 = vlasnik4;
	}

	public String getVlasnik2() {
		return vlasnik2;
	}

	public String getVlasnik3() {
		return vlasnik3;
	}

	public String getVlasnik4() {
		return vlasnik4;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getSerijskiBroj() {
		return serijskiBroj;
	}

	public void voznja() {
		System.out.println("Brrrrrrrmmmmmm :)");

	}
	// proba metoda
	/*
	 * public void podaciVozilo () { System.out.println("Novi vlasnik auta " + +
	 * " modela " + " je " + ); }
	 * 
	 * public int podaciVozilo ()
	 */
}