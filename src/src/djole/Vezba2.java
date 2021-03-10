package djole;

import java.util.Scanner;

public class Vezba2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Unesite prirodan broj:");
		int n= sc.nextInt();
		while (n<=0) {
			System.out.println("broj mora da bude veci od nule");
			System.out.println("unesite prirodan broj:");
			n= sc.nextInt();
		}
		int proizvod=1;
		for (int i=1;i<=n;i++) {
			if (i%2==0) {
				
			proizvod= proizvod*i;
			}
		}
		System.out.println("proizvod je: "+ proizvod);
		
		
		
	

	}

}
