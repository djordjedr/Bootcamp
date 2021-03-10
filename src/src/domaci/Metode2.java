package domaci;

import java.util.Scanner;

public class Metode2 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		int duzina=sc.nextInt();
		
		int[] niz = new int [duzina];
		
		for (int i=0; i< duzina; i++) {
			System.out.println("unesite "+ i + ". element niza:");
			niz [i]=sc.nextInt();
		}
		
		for (int i=0; i< duzina; i++) {
			System.out.println(i + ". element je " + niz [i]);
			
		}
		

	}
	

}
