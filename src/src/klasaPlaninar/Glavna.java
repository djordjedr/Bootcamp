package klasaPlaninar;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		Planinar p1 = new Planinar("Nebojsa", "Nebojsic", "Srbija");
		Alpinista a1 = new Alpinista("Nikola", "Nikolic", "Bosna");
		Alpinista a2 = new Alpinista("Zivojin", "Zisic", "Crna Gora");
		KlasicniPlaninar kp1 = new KlasicniPlaninar("Klasa", "Klasic", "Hrvatska");
		List<Planinar> listaPlaninara = new ArrayList<Planinar>();
		List<Planinar> listaPlaninara2 = new ArrayList<Planinar>();

		List<Cvece> lb = new ArrayList<Cvece>();
		Cvece c1 = new Cvece("bela rada", "bela");
		Cvece c2 = new Cvece("narcis","zuta" );
		Cvece[] bc1 = { c1, c2 };
		Cvece[] bc2 = { c2 };
		
		Planina pl1 = new Planina("Avala", 511, bc1, listaPlaninara );
		Planina pl2 = new Planina("Triglav", 1511, bc2, listaPlaninara2 );
		// System.out.println(p1);
		// System.out.println(pl1);
		
		listaPlaninara2.add(a2);
		

		pl1.dodajPlaninara(p1);
		pl1.dodajPlaninara(a2);
		pl1.dodajPlaninara(a1);

		/*
		 * System.out.println(listaPlaninara); pl1.ispisPlaninara();
		 * listaPlaninara.remove(1); pl1.ispisPlaninara(); listaPlaninara.add(kp1);
		 * System.out.println(); pl1.ispisPlaninara();
		 */
		Planinar d = listaPlaninara.get(0);
		System.out.println(d);
		System.out.println();
		pl1.dodajPlaninara(d);
		pl1.ispisPlaninara();
		listaPlaninara.remove(1);
		System.out.println();
		pl1.ispisPlaninara();

		listaPlaninara2.add(kp1);
		listaPlaninara2.add(a2);
		// System.out.println(listaPlaninara2.size());
		System.out.println(pl2.brojPlaninara());
		int broj = pl2.brojPlaninara();
		System.out.println(broj);

		pl2.brisiPlaninara(a2);
		pl2.ispisPlaninara();
		System.out.println(pl2.getListaPlaninara());
		pl2.IspisPC();
	}

}
