package knjiga;

public class Main {

	public static void main(String[] args) {
		Knjiga k1=new Knjiga ("PrviNaslov", "JA", 1290, 498.55);
		Knjiga k2=new Knjiga ("DrugiNaslov", "Ti", 70896, 1000.3);
		
		System.out.println("Zarada iznosi " + zarada(k1.getbrojProdatihPrimeraka(),k1.getCena()));
		
	}
	
	public static double zarada(int brojPrimeraka, double cena) {
		double zarada= brojPrimeraka*cena;
		//System.out.println("Broj primeraka je "+ brojPrimeraka);
		//System.out.println("Cena je " + cena + "");
		return zarada;
		
	}
}
