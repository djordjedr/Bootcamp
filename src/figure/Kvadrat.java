package figure;
/*
 * Napraviti klasu GeometrijaFigura koja sadrzi podatke o x i y koordinatama tezista figure.
 *  Napraviti klasu Krug koja sadrzi podatak o poluprecniku. Napraviti klasu Kvadrat koja sadrzi 
 *  podatak o duzini stranice. Napraviti klasu Trougao koja sadrzi podatke o duzinama stranica.
 *   Za sve njih omoguciti funkcije za racunanje obima i povrsine. Napraviti listu figura. Igrati se sa njom.
 */

public class Kvadrat extends GeometrijaFigura {
	private int stranica;
	public Kvadrat(int x, int y, int stranica) {
		super(x, y);
		this.stranica=stranica;
		// TODO Auto-generated constructor stub
	}
	
	public void Obim() {
		System.out.println("Povrsina je: " + stranica*stranica); 
	}
	
	public void Povrsina() {
		System.out.println("Obim je: " + 4*stranica);
	}
	
	public int getStranica() {
		return stranica;
	}
	public void setStranica(int stranica) {
		this.stranica = stranica;
	}

}
