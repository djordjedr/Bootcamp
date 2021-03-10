package prviZadatak;

import java.util.Scanner;

/*
 * Napisati program koji sluzi za sabiranje elemenata dva niza iste duzine i rezultat upisuje u treci niz.
 *   Sa konzole se ucitava prvo duzina nizova
zatim svi elementi jednog niza, pa svi elementi drugog niza. Ucitavanje elemenata niza izdvojiti u
 posebnu funkciju.
Ta dva niza proslediti funkciji koja uzmima odgovarajuci element prvog niza i odgovarajuci element drugog niza i njihov zbir upisuje na odgovarajuce
mesto u trecem nizu. Sabiraju se elementi sa istim indeksom. Ispisati niz sa zbirovima. Za ispis napraviti posebnu funkciju.

Primer:
prvi niz 	1 	3 	5
drugi niz	6 	7 	8
treci niz	7 	10 	13

 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int duzina1=0;
		
		int duzina2=0;
		
		System.out.println("Unesite duzinu prvog niza: ");
		duzina1=sc.nextInt();
		
		System.out.println("Unesite duzinu drugog niza: ");
		duzina2=sc.nextInt();
		/*
		do  {
			System.out.println("Unesite duzinu prvog niza: ");
			duzina1=sc.nextInt();
			
			System.out.println("Unesite duzinu drugog niza: ");
			duzina2=sc.nextInt();
			if (duzina1!=duzina2)
				System.out.println("Unesene duzine moraju biti jednake!");
		}
			while (duzina1!=duzina2); {
	
			}
		*/
		//int duzina3=sc.nextInt();
			
		
	
		
		int niz1 []=new int [duzina1];
		int niz2 []= new int[duzina2];
		int niz3 []= new int [duzina1];
		
		Ucitavanje1(niz1);
		
		Ucitavanje2(niz2);
		
		Sabiranje(niz2,niz1,niz3);
		Ispis(niz3);
	}

	public static void Ucitavanje1 ( int niz1[]) {
		Scanner sc=new Scanner(System.in);
		//int niz1 = 0;
		for (int i=0;i<niz1.length;i++) {
			System.out.println("Unesi "+ (i+1) + ". clan prvog niza:");
			niz1[i]=sc.nextInt();
		}	
	}
	
	public static void Ucitavanje2 ( int niz2[]) {
		Scanner sc=new Scanner(System.in);
		//int niz2[] = 0;
		for (int i=0;i<niz2.length;i++) {
			System.out.println("Unesi "+ (i+1) + ". clan drugog niza:");
			niz2[i]=sc.nextInt();
		}	
	}

	public static void Sabiranje ( int niz2[],int niz1[], int niz3[] ) {
		int g=0;
		int m=0;
		if(niz1.length<niz2.length) {
		  g = niz1.length;
		  m=niz2.length;
		  for (int i=0;i<g;i++) {
				niz3 [i]=niz1[i]+niz2[i];
				}
		  for (int i=g;i<m;i++) {
				niz3 [i]=niz2[i];
				}
		}
		else
		{ g=niz2.length;
		m=niz1.length;
		for (int i=0;i<g;i++) {
			niz3 [i]=niz1[i]+niz2[i];
			}
	  for (int i=g;i<m;i++) {
			niz3 [i]=niz1[i];
			}
		}
		
	}
	
	public static void Ispis ( int niz3[] ) {
		for (int i=0;i<niz3.length;i++) {
			System.out.println("Duzina "+ i+ ". clana niza je " +niz3 [i]);
			}	
	}

	
}
