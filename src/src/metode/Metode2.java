package metode;

import java.util.Scanner;

public class Metode2 {

	public static void main(String[] args) {
		/*
		 * Metode2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj program treba da pozove 
		 * i vrati (u mainu) proizvod unetih brojeva.

		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Unesite prvi ceo broj:");
		int prviBroj=sc.nextInt();
		
		
		System.out.println("Unesite drugi ceo broj:");
		int drugiBroj=sc.nextInt();
		
		
		System.out.println("Unesite treci ceo broj:");
		int treciBroj=sc.nextInt();
		
		System.out.println("Proizvod unetih brojeva je: " + proizvod(prviBroj, drugiBroj, treciBroj));
	}
		public static int proizvod(int a, int b, int c) {
			
			return a*b*c;
			
		}

}
