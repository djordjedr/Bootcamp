package klaseSportista;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sportista s1=new Sportista("Jovan", "Jovanovic", 2000);
		
		
		Teniser t1=new Teniser("Nepoynati", "Nepoznatovic", 1990, "prvak");
		
		Kosarkas k1=new Kosarkas("Vlade", "Divac", 1980, 2.1, "Lejkers");
		k1.setVisina(2.12);
		System.out.println(k1.getVisina()+(" ")+ k1.getIme()+(" ")+ k1.getPrezime()+(" ")+ k1.getKlub());
		
		Sahista sh=new Sahista("Nikola", "Nikojlovic", 1976, "svetska");
		
		List<Sportista> listaS=new ArrayList<Sportista>();
		listaS.add(sh);
		listaS.add(s1);
		listaS.add(k1);
		listaS.add(t1);
		
		Sportista prom=listaS.get(2);
		//System.out.println(prom);
		
		if(prom instanceof Kosarkas) {
			 k1=(Kosarkas)listaS.get(2);
			 System.out.println(k1.getVisina());
		}
		
		Sportista prom1=listaS.get(0);
		if(prom1 instanceof Sahista) {
			sh=(Sahista) listaS.get(0);
			System.out.println(sh.getTitula());
		}
		
	}

}
