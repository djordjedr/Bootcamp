package projekat10;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza.
		 * Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili
		 * nije. Na standradnom izlazu obavestiti krajnjeg korisnika njemu razumljivim
		 * tekstom da li je unesen niz palindrom.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");

		int duzina = sc.nextInt();
		int[] niz = new int[duzina];
		int palindrom = 0;
		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesi " + (i + 1) + ". clan niza:");
			niz[i] = sc.nextInt();

		}
		int resenje = palindrom(niz);
		if (resenje == 0) {
			System.out.println("Niz nije palindrom");
		} else {
			System.out.println("Niz je palindrom");
		}
	}

	public static int palindrom(int n[]) {
		int p = 0;
		int i = 0;
		int privremeni = 0;
		for (i = 0; i < (n.length) / 2; i++) {

			if (n[i] != n[n.length - i - 1])
				p = 0;

			else
				p = 1;

		}

		return p;
	}
}