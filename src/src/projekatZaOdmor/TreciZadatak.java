package projekatZaOdmor;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna zbir prvih  n prirodnih brojeva, izostavljajuci
		 * one koji su deljivi brojem k.
		 * 
		 */
	
		int n=0;
		int k=1;
		
		
		int ulaz=prirodan(n);
								
		int delilac=delilacM(k);
		
		int rezultat=rezultat1(ulaz,delilac);
		
		System.out.println("Zbir iznosi " + rezultat);
		
		/*
		for (int i = 0; i <= ulaz; i++) {

			

			 if(i % delilac == 0) {
				
				continue;
			}
			// System.out.println("i je " + i);
			
			broj = broj + i;
			
		}
		System.out.println("Zbir iznosi " + broj);
		
		*/
	}
	public static int prirodan (int a) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println( "Unesite prirodan broj (>0)");
			
			a = sc.nextInt();
		} while (a <= 0);
		
		return a;
		}
	
	
	public static int delilacM(int a)  {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Unesite broj k (ne sme biti 0):");
			a = sc.nextInt();
		} while (a == 0);
		
		return a;
		
	}
	
	public static int rezultat1(int a,int b) {
		int broj=0;
		for (int i = 0; i <= a; i++) {

			

			 if(i % b == 0) {
				
				continue;
			}
			// System.out.println("i je " + i);
			
			broj = broj + i;
			
		}
		return broj;
		
	}
	}

