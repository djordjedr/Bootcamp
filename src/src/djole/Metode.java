package djole;

import java.util.Scanner;

public class Metode {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//System.out.println( "Najveci broj je: " + maksimum() );
		
		
		ispisiMax();
		
		

	}
	public static void ispisiMax() {
		System.out.println("Najveci broj je: " + maksimum());
	}
	
	public static int maksimum() {
		int max=0;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesi koliko brojeva ces uneti:");
		 n=sc.nextInt();
		 boolean izlaz=true;
		
		while(n<=0) {
			System.out.println("nedozvoljen unos!");
			izlaz=false;
			break;
		}
		
		
		while(izlaz==true) {
		for(int i=1; i<=n; i++) {
		
	System.out.println("upisi "+ i +  ". cifru:");
		int broj=sc.nextInt();
		if (i==1) {
			max=broj;
		}
		
		if (max<broj) {
			max=broj;
		}
		}
		}
		return max;
		
		
	
	}
}
