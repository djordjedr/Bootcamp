package djole;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati zbir prirodnih
		 * brojeva do n na sledeci nacin: 1) u zbir nece ulaziti brojevi deljivi brojem
		 * 5 2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir
		 * brojeva do tog trenutka.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int zbir = 0;

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				
				System.out.println("i je " + i);
				
				if ( i % 5 == 0) {
					continue;
				}
												
				zbir = zbir + i;
				
				System.out.println("zbir " + zbir);
				
				if (i == 13) {
					
					System.out.println("Zbir je: " + zbir);
					break;
				}

			}
		} else {
			System.out.println(" \"n\" mora biti veci od nule");
		}
	}

}
