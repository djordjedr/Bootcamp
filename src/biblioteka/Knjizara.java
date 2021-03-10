package biblioteka;

public class Knjizara {

	public static void main(String[] args) {
		
		Autor a1=new Autor("Lav","Tolstoj", 1828);
		Autor a2=new Autor("Fjodor","Dostojevski", 1821);
		Autor a3=new Autor("Isak","Asimov" ,1920);
			
		
		Knjiga k1 = new Knjiga("Rat i mir", a1);
		Knjiga k2 = new Knjiga("Idiot", a2);
		Knjiga k3= new Knjiga("Zli dusi", a2);
		Knjiga k4= new Knjiga("Sabrana dela roboti",a3);
		
		a2.setIme("Fjodor Mihailovic");
		
		System.out.println(k2.getAutor().getIme());
		System.out.println(k3.getAutor().getIme());
		k1.setBrojProdatihPrimeraka(10);
		k1.setCena(1500);
		
		k1.izracunajProfit();
		
		System.out.println(k3.getAutor().getPrezime());
		
		System.out.println("Profit od knjige " + k1.getNaslov() + " je " + k1.izracunajProfit());
		
		/*k2.setBrojProdatihPrimeraka(20);
		k2.setCena(1000);
		
		System.out.println(k1.getNaslov() + " " + k1.getAutor());
		
		System.out.println(k1.getBrojProdatihPrimeraka());
		
		k1.setBrojProdatihPrimeraka(12);
		
		System.out.println(k1.getBrojProdatihPrimeraka());

*/
	}
	
	

}