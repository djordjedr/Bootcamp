

import java.util.ArrayList;
import java.util.List;

public class Knjizara {

	public static void main(String[] args) {
		
		Autor a1 = new Autor("Lav", "Tolstoj", 1828);
		Autor a2 = new Autor("Fjodor", "Dostojevski", 1821);
		
		Knjiga k1 = new Knjiga("Rat i mir", a1);
		Knjiga k2 = new Knjiga("Idiot", a2);
		Knjiga k3 = new Knjiga("Zli dusi", a2);
		
		k3.setAutor(a1);
		
		a2.setIme("Fjodor Mihailovic");
		
		System.out.println(k2.getAutor().getIme());
		System.out.println(k3.getAutor().getIme());
		
		//deklarisanje liste sa imenoom lista
		List<Knjiga> lista=new ArrayList<Knjiga>();
		System.out.println("Lista size" + lista.size());
		
		System.out.println("lista.add(k2)" +lista.add(k2));
		
		
		System.out.println("lista.get(0).getNaslov()" +lista.get(0).getNaslov());
		
		lista.get(0).setCena(500);
		
		System.out.println("k1.getCena()" +k1.getCena());
		
		System.out.println("lista.size()" +lista.size());
		
		lista.add(k1);
		lista.add(k3);
		
		System.out.println("lista.size()"+lista.size());
		
		
		
		
		
		
		Autor a = k1.getAutor();
		
		System.out.println(a.getIme());
		
		a = k2.getAutor();
		
		//a1.setIme("Lav Nikolajevic");
		
		System.out.println(a.getIme());
		
		int n = 5;
		int m = 6;
		m = n; // m = 5
		n = 7; // m = 5
		
		/*k1.setBrojProdatihPrimeraka(10);
		k1.setCena(1500);
		
		k1.izracunajProfit();
		
		System.out.println("Profit od knjige " + k1.getNaslov() + " je " + k1.izracunajProfit());
		
		k2.setBrojProdatihPrimeraka(20);
		k2.setCena(1000);*/
		
		//System.out.println(k1.getNaslov() + " " + k1.getAutor());
		
		/*System.out.println(k1.getBrojProdatihPrimeraka());
		
		k1.setBrojProdatihPrimeraka(12);
		
		System.out.println(k1.getBrojProdatihPrimeraka());*/

	}
	
	

}