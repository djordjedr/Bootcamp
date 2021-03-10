package doWhile;

import java.util.Scanner;

public class Maksimalna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int broj = sc.nextInt();

		int cifra = 0;

		int max = 0;

		do {
			cifra = broj % 10;
			if (cifra > max) {
				max = cifra;
			}

			broj /= 10;

		} while (broj != 10);

		System.out.println("Maksimum je " + max);

	}

}
