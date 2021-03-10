package projekatZaOdmor;

import java.util.Scanner;

public class PrviZadatak {

	public static void main(String[] args) {
		// Napisati program koji ispisuje koliko cifara ima uneti broj n.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Upisite broj:");
		int broj=sc.nextInt();
		
		int rezultat;
	/*
	
	if (broj<0) {
		broj=-broj;
	}
	*/
				
		rezultat=cifra(broj);
		
		System.out.println("Broj ima: " + rezultat + " cifara");
				
	}
	public static int cifra (int ulaz) {
		
		int rezultat1=0;
		while (ulaz!=0) {
			
			ulaz=ulaz/10;
			
			rezultat1++;
					}
		
		return rezultat1;
		
	}
	
	
}