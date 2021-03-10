package projekat10;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji izracunava proizvod elemenata niza koji su veci od
		 * njihovog indeksa. Za unos niza i za proizvod koristiti zasebno metode. Duzina
		 * niza i unos niza ucitavaju se sa standardnog ulaza. Primer ucitanog niza: 3 7 1 4 2 5 Primer
		 *  izracunatog proizvoda: 84
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int duzina = sc.nextInt();
		int[] niz = new int[duzina];
		unos(niz);
		int rezultat=proizvod(niz);
		System.out.println("Proizvod iznosi " + rezultat);
		
	}

	public static void unos(int n[]) {

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n.length; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza");
			n[i] = sc.nextInt();
		}
	}
	//proizvod elemenata niza koji su veci od njihovog indeksa
	public static int proizvod(int n1[] ) {
		int proizvod=1;
		for (int j=0; j<n1.length; j++ ) {
			if (n1[j]>j) {
				proizvod=proizvod*n1[j];
				
			}
			
		}
		return proizvod;
	}
}