package figure;
/*
 * Napraviti klasu GeometrijaFigura koja sadrzi podatke o x i y koordinatama tezista figure.
 *  Napraviti klasu Krug koja sadrzi podatak o poluprecniku. Napraviti klasu Kvadrat koja sadrzi 
 *  podatak o duzini stranice. Napraviti klasu Trougao koja sadrzi podatke o duzinama stranica.
 *   Za sve njih omoguciti funkcije za racunanje obima i povrsine. Napraviti listu figura. Igrati se sa njom.
 */
public class GeometrijaFigura {
	private int x;
	private int y;
	
	public GeometrijaFigura(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
