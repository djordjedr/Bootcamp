package figure;
/*
 * Napraviti klasu GeometrijaFigura koja sadrzi podatke o x i y koordinatama tezista figure.
 *  Napraviti klasu Krug koja sadrzi podatak o poluprecniku. Napraviti klasu Kvadrat koja sadrzi 
 *  podatak o duzini stranice. Napraviti klasu Trougao koja sadrzi podatke o duzinama stranica.
 *   Za sve njih omoguciti funkcije za racunanje obima i povrsine. Napraviti listu figura. Igrati se sa njom.
 */
public class Krug extends GeometrijaFigura {
	private double poluprecnik;
	
	public Krug(int x, int y,double poluprecnik) {
		super(x, y);
		this.poluprecnik=poluprecnik;
		// TODO Auto-generated constructor stub
	}

	public void Obim() {
		System.out.println("Povrsina je: " + 2*poluprecnik*3.14); 
	}
	
	public void Povrsina() {
		System.out.println("Obim je: " + 3.14*poluprecnik*poluprecnik);
	}
	
	
	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

}
