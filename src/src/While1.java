import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {

			/*Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj,
			 *  i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11

*/

		double pocetni, zbir =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("unesite pozitivan broj:");
		//U zadatku nigde nije definisano da su u pitanju iskljucivo celi brojevi

			while (true) {
				//beskonacna petlja
				pocetni=sc.nextDouble();
				// pocetni moramo da definisemo unutar  petlje zbog opsega tj, da bi mogao da ga procita
				if(pocetni<0) {
					break;
				}
				else {
				/*break izjava izbacuje iz beskonacne petlje ukoliko se uslov u if ispuni, ali mi nije jasno sto
				 *  ova petlja radi iako izbacimo viticaste zagrade iz if uslova
				 *  Stavise, petlja radi i bez else i njegovih viticastih zagrada, tj kao da je else izjava ovde suvisna?
				*/
					zbir+=pocetni;
					//System.out.println("zbir iznosi:" + zbir); nije trazeno u zadatku
					System.out.println("unesite pozitivan broj:");
				}
		}
				System.out.println("Zbir je: "+ zbir);
	}
}
