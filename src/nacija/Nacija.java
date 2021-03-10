package nacija;

public class Nacija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napraviti klasu Kontinen. Sadrzi podatke o imenu kontinenta i dominantnoj rasi.
		 *  Uvezati ga sa klasom drzava.
		 */
		Kontinent k1=new Kontinent("EvroAzija", "homosapiens");
		Kontinent k2=new Kontinent("Afrika", "homoerectus");

		Drzava d1=new Drzava("Srbija", "Uz Marsala Tita",k1);
		Drzava d2=new Drzava("Crna Gora", "Uz Marsala Tita",k2);
		Drzava d3=new Drzava("Hrvatska", "Uz Marsala Tita",k2);
		
		Grad g1=new Grad("Beograd", 117, 1760000,d1);
		Grad g2=new Grad("Zagreb", 120, 200000,d3);
		Grad g3=new Grad("Podgorica", 100, 10000,d2);
		Grad g4=new Grad("Subotica", 50, 56000,d1);
		Grad g5=new Grad("Pozarevac", 70, 170000,d1);
		Grad g6=new Grad("Jagodina", 50, 760000,d1);
		
		
		
		System.out.println(g1.getIme() + " "+ g1.getDrzava().getKontinent().getRasa());
		
		System.out.println(g1.getIme() + " "+ g1.getDrzava().getIme()+" " + g1.getDrzava().getHimna()+ " "+ g1.getDrzava().getKontinent().getIme());
		
		System.out.println(d1.getIme() + " " + d1.getHimna());
	}

}
