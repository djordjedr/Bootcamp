package projekatZaOdmor;

import java.util.Arrays;

import java.util.Scanner;

public class PetiZadatak {

	public static void main(String[] args) {
		/*
		 * Cest zadatak na intervjuu: Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i minimalni broj.
*/
		
		//resenje sa nizom DRUGO RESENJE
		// U prilogu zadatka su zakomentarisana i ostala dva resenja
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete? ");
		int n=sc.nextInt();
		double [] niz= new double [n];
		double max=0;
		double min=0;
		
		
		for (int i=0;i<n;i++) {
			System.out.println("unesi " + (i+1) + ". broj");
			niz[i]=sc.nextDouble();
			//System.out.println(niz[i]);
				if(i==0) {
					max = niz[i];
					min = niz[i];
				}
				if (niz[i]>max) {
					max = niz[i];
				}
				else {
					min=niz[i];
				}
		}
		System.out.println("maksimum je "+ max);
		System.out.println("Minimum je " + min);
		
		// resenje sa Arrays.sort metodom koju sam nasao -ELEGANTNO
		
		/*
		int i=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Koliko brojeva zelite da unesete? ");
		int n=sc.nextInt();
		double [] niz=new double [n];
		
		for( i=0; i<n; i++) {
			System.out.println("Unesite " + (i+1) +  ". broj:");
			niz [i]=sc.nextDouble();
			
		}
		
		
		
		Arrays.sort(niz);										// import java.util.Arrays;
		System.out.println("minimum je " + niz[0]);						
		System.out.println("Maximum je " + niz[niz.length-1]);
		
		*/
		
		
		//resenje bez nizova MOJE PRVO RESENJE
		/*
		int memorija=0;
		int max=0;
		
		int min=0;
		
		for (int i=1; i<=n; i++) {
			System.out.println("Unesite " + i + ". broj");
			int broj=sc.nextInt();
			memorija=memorija+broj;
			if (i==1) {
				 max=broj;
				 min=broj;
			}
			
			
			if (broj>max) {
				max=broj;
				//System.out.println("Maksimum je " + max);
				
			}
			
			else {
				min=broj;
				//System.out.println("Minimum je " + min);
			}
			
			
		}
		
		
		*/
	}
	
}
