package vezbanje;
import java.text.DecimalFormat; //Import za ogranicavanje decimala
import java.math.RoundingMode; //Import zs zsokruzivanje decimala

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		/*
		 * 
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa (zatvaranje kase)
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna 
i da se ponovo ispise meni.
	Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu.
	 Zatim se ponovo ispisuje meni.


		 */
		DecimalFormat df2 = new DecimalFormat("#.##");
		Scanner sc= new Scanner(System.in);
		
		boolean meny = true;
		double cena=0;
		double racun=0;
		double novac=0;
		
		while(meny==true) {
			
			if (racun==0) {
				System.out.println("Vasa korpa je prazna \n");
			}
			else {
				System.out.println("Pazarili ste za :"+ df2.format(racun) + " rsd \n");
			}
			
		System.out.println("izaberite jednu od opcija: \n");
		System.out.println("0 - Izlaz iz programa (zatvaranje kase)");
		System.out.println("1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)");
		System.out.println("2 - naplata racuna");
		
		int ulaz=sc.nextInt();
		
		
			//while (meny==true) {
			
		
		switch(ulaz) {
		
		
			case 0:
				System.out.println("program je zavrsen.");
				meny=false;
				break;
				
			case 1:
				System.out.println("unesite cenu proizvoda:");
				cena=sc.nextDouble();
				if (cena<=0) {
					System.out.println("nepravilan unos");
					break;
				}
				racun=racun+cena;
				System.out.println("Vas racun iznosi "+ df2.format(racun) + " din \n");
				//meny=true;
				break;
				
			case 2:
				
				if (racun==0) {
					System.out.println("Niste jos nista kupili! \n");
					break;
					}
				
				
				System.out.println("Unesite kolicinu novca za naplatu racuna:");
				novac=sc.nextDouble();
				
				
				if (novac<racun) {
					System.out.println("Greska. Kolicina novca je manja od visine racuna \n ");
					
					//meny=true;
				}
				
				else {
						novac=novac-racun;
						System.out.println("Vas kusur iznosi "+ df2.format(novac) + " din\n");
						
						
						novac=0;
						racun=0;
						//meny=true;
					}
					
				break;
				
				default:
					System.out.println("Nepravilan unos \n");
		}
		}
	}

}
