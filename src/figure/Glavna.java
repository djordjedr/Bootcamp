package figure;

import java.util.ArrayList;
import java.util.List;

/*
 * Napraviti klasu GeometrijaFigura koja sadrzi podatke o x i y koordinatama tezista figure.
 *  Napraviti klasu Krug koja sadrzi podatak o poluprecniku. Napraviti klasu Kvadrat koja sadrzi 
 *  podatak o duzini stranice. Napraviti klasu Trougao koja sadrzi podatke o duzinama stranica.
 *   Za sve njih omoguciti funkcije za racunanje obima i povrsine. Napraviti listu figura. Igrati se sa njom.
 */
public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <GeometrijaFigura> listaFigura= new ArrayList <GeometrijaFigura>();
		
		GeometrijaFigura g1=new GeometrijaFigura(2, 3);
		Trougao t1=new Trougao(1 , 2 , 1.3 , 2.5 , 3.1);
		Kvadrat k1=new Kvadrat(1, 2, 5);
		Krug k0=new Krug(3, 3, 2.4);
		
		
		listaFigura.add(g1);
		listaFigura.add(k0);
		listaFigura.add(k1);
		listaFigura.add(t1);
		
		t1.Obim();
		t1.Povrsina();
		
		k1.Obim();
		k1.Povrsina();
		
		k0.Obim();
		k0.Povrsina();
	}

}
