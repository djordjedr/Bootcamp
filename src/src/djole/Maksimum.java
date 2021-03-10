package djole;

import java.util.Scanner;

public class Maksimum {

	public static void main(String[] args) {
		
	
		// sracunajte maksimalnu cifru
		Scanner sc=new Scanner(System.in);
		System.out.println("upisite broj");
		int broj=sc.nextInt();
		int max=0;
		int sledeci=0;
		
		while(broj>0)
		 {
					
		sledeci=broj%10;
		//System.out.println(sledeci+ "sledeci");
		if (sledeci>max) {
			max=sledeci;
			//System.out.println(max+ "max");
		}
		broj=broj/10;
		//System.out.println(broj + "broj");
		}
		 
		System.out.println(max);
		
	}
}