package automobiliKlase;

/*
 * vozilo  - Napisati klasu Automobil. Automobil ima 
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku        Napisati klasu Voznja iz koje ce program moci da se pokrene. 
U njoj ce se kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.
 */

public class Voznja {

	public static void main(String[] args) {

		Automobil a1 = new Automobil("Toyota", "Avensis", 21900);
		Automobil a2 = new Automobil("Toyota", "Avensis", 21950);
		Automobil a3 = new Automobil("GAZ", "BRDM-2", 9999);
		Automobil a4 = new Automobil("Moskvich", "Aleko", 12434);
		Automobil a5 = new Automobil("messerschmitt", "kr200", 3447);

		a3.getModel();
		a3.voznja();
		a1.setVlasnik1("Milan");
		a1.setVlasnik2("Djordje");
		a1.setVlasnik4("Nemanja");

		System.out.println("Vlasnici automobila " + a1.getMarka() + a1.getModel() + " serijskog broja "
				+ a1.getSerijskiBroj() + "su: " + a1.getVlasnik1() + " " + a1.getVlasnik2() + " " + a1.getVlasnik3());
	}
}