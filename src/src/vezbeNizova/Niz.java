package vezbeNizova;

import java.util.Scanner;

public class Niz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi duzinu niza");
		int duzina = sc.nextInt();
		int niz[] = new int[duzina];

		unos(sc, niz);
		
		/*
		 * 
		 * 
		 */
		
			
		/*
		 * for(int i=0;i<niz.length;i++) { System.out.println(i + ". clan niza je "+
		 * niz[i]);
		 * 
		 * }
		 */

	}

	public static void unos(Scanner sc, int niz[]) {
		
		for(int i=0;i<niz.length;i++) {
			System.out.println("Unesite " +i + ". el niza");
			niz[i]=sc.nextInt();
		}
	}	
		public static void izlaz1(int niz1[]) {
			
			for(int i=0;i<niz1.length;i++) {
				System.out.println(i + ". clan niza je "+ niz1[i]);
				
			}
			
		}
		
	}

