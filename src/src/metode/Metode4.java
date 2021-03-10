package metode;

public class Metode4 {

	public static void main(String[] args) {
		/*
		 * Da li u nasoj klasi mozemo da imamo sledece funkcije i zasto?

public static void vrati() {
	System.out.println(“Vrati mi olovku”);
}
	
	
	public static String vrati() {
		return “Vrati mi svesku”;
}

Obrazlozenje predati kao Zadatak4 u Google doc-u

		 */

		
		
		vrati1();
		
		System.out.println("Nebojsa treba da " + vrati());
	}
	
	public static void vrati1() {
		System.out.println("Vrati mi olovku");
	}
		
		
		public static String vrati() {
			return "Vrati mi svesku";
	}
/*
 * U klasi ne sme da bude vise metoda sa istim imenom i zato ce se javljati greska prilikom kompajliranja.
 * Prva metoda ce raditi ako joj se promeni ime.  Ona je void tipa, tj ne vraca vrednost i u samoj metodi se vrsi ispisivanje
 * sa System.out.println. Znaci u main-u samo treba da ispisemo (promenjeno) ime metode sa praznim zagradama.
 * Druga metoda ce raditi zato sto vraca String koji je pravilno deklarisan iza return izjave.
 * Metode nemaju ulazne parametre i pozivaju se bez parametara, samo sa otvorenom i zatvorenom zagradom
 * Ukoliko zelimo da "vratimo" drugu metodu ispisacemo u main System.out.println i unutra ime metode sa zagradama bez ulaznih parametara
 */

}
