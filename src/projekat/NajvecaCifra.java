package projekat;

import java.util.Scanner;

public class NajvecaCifra {

	public static void main(String[] args) {
		/*
		 * Napisi program koji pronalazi najvecu cifru u nizu
		 */
		int max=0;
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi duzinu niza:");
		int duzina= sc.nextInt();
		int niz[] = new int [duzina];
		
		for (int i=0; i<duzina;i++) {
			System.out.println("Unesite " + i + "element niza");
			niz[i] =sc.nextInt();
			
			
			 if (i==0) {
					 max = niz[i];
			 }
		
		
		
		 if (niz[i]>max) {
			 max=niz[i];
			 
			 
		 }
		
	
		
	 }
		
		public static int maxNiza (int a, int niz[]) { 
			return max;         
			System.out.println("maximani element niza je " + max);
			
		
		
		}
			
		
		
	/*	for (int i=0; i<duzina; i++) {
			System.out.println(i +  "element niza je " + niz[i]);
		}
		*/
		}
	
	

}
