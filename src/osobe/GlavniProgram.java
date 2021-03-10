package osobe;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Osoba> listaOsoba=new ArrayList<Osoba>();
		Osoba o1=new Osoba("Ivan", "Ivkovic", "Nepoznata BB");
		Djak d1= new Djak("Djordje", "Djordjevic", "Nepostojeca BB", "OS Nevazna", 3);
		Zaposleni z1=new Zaposleni("Milan", "Milanovic", "Negativna BB", "Pod stecajom", "Dzabolebarosa");
		
		listaOsoba.add(o1);
		listaOsoba.add(d1);
		listaOsoba.add(z1);
		
		System.out.println(o1.getPrezime());
		
		if (d1 instanceof Djak) {
			Djak d=(Djak) d1;
			System.out.println(d.getSkola());
			
			for(int i=0;i<listaOsoba.size();i++) {
				System.out.println(listaOsoba.get(i).getAdresa());
			}
		}
		
	}

}
