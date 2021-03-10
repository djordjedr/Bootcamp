package Vezbe;

import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		/*
		 * Napisati jednostavni kalkulator. Korisnik unosi dva broja i onda iz menija bira jednu od cetiri racunske 
		 * operacije koja ce se nad tim brojevima izvrsiti. Ispisati rezultat te operacije.
		 */
		Scanner sc= new Scanner(System.in);
		
		System.out.println("unesite prvi broj:");
		double x =sc.nextDouble();
		
		System.out.println("unesite drugi broj:");
		double y=sc.nextDouble();
		
		System.out.println("unesite jednu od sledecih opcija: ");
		System.out.println("1. Sabiranje");
		System.out.println("2. Oduzimanje");
		System.out.println("3. Mnozenje");
		System.out.println("4. Deljenje");
		int opcija=sc.nextInt();
		double rezultat=0;
		switch (opcija) {
		case 1:
			rezultat=x + y;
			System.out.println("Rezultat je: "+ rezultat);
			break;
			
		case 2:
			rezultat= x-y;
			System.out.println("Rezultat je: "+ rezultat);
			break;
			
		case 3:
			rezultat= x*y;
			System.out.println("Rezultat je: "+ rezultat);
			break;
			
		case 4:
			while (y==0)
			{
				System.out.println("delilac ne sme biti 0");
				System.out.println("unesite delilas:");
				y=sc.nextDouble();
				
			}
			rezultat= x/y;
			System.out.println("Rezultat je: "+ rezultat); 
			break;
			
		default:
			while(opcija<=0 || opcija>4 ) {
			System.out.println("nevalidan unos");
			System.out.println("unesite validan unos od 1 do 4:");
			opcija=sc.nextInt();
		}
	}
	}
}

