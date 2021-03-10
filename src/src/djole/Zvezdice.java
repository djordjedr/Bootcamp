package djole;

import java.util.Scanner;

public class Zvezdice {

	public static void main(String[] args) {
		/*
		 * Napraviti program koji ce odstampati na standardnom izlazu trougao od
		 * zvezdica. Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati
		 * ovako:
		 * 
		 * * * * * * * * * * *
		 *
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Upisite ceo broj:");
		int broj = sc.nextInt();

		for (int i = 0; i <= broj; i++) {
			System.out.println("");
			
			for (int j = broj; j > i; j--) {
				System.out.print("*");
				
			
				for (int k = i; k < j; k++) {
					System.out.print(" ");
				}
				
			}
			
		}

	}

}
