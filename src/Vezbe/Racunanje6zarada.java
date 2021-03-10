package Vezbe;

import java.util.Scanner;

public class Racunanje6zarada {

	public static void main(String[] args) {
		
		/*
		 * Izracunati naknadu koju porodilja ostvaruje tokom bolovanja. Naknada se racuna kao prosek zarade u poslednjih 6
		 *  meseci. Korisnik unosi zarade to trenutkakada unese 0. Onda se prestaje sa unosom i ispisuje se prosek. Ukoliko
korisnik unese neispravan podatak (negativan broj) vratiti ga da unese ponovo dok ne unese ispravan pdatak.

		 */
		//System.out.println("Unesite platu:");
		
		
		double suma=0;
		int brojac=1;
		do {
			System.out.println("Unesite "+brojac+" platu:");
			Scanner sc= new Scanner(System.in);
			double plata=sc.nextDouble();
			if (plata<0) {
				System.out.println("Unesite ispravan podatak");
				continue;
			}
			if(plata==0) {
				break;
			}
			brojac++;
			suma=suma+plata;
		}
		while(brojac<=6);
		System.out.println("prosek "+ suma/6 );
		
		if(suma/6>1500) {
			System.out.println("vasa plata je prevelika i iznosice 1500e");
			
		}
	}	
	

}
