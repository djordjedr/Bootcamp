package Vezbe;

import java.util.Scanner;

public class Meni {

	public static void main(String[] args) {
		System.out.println("MENI");
		
		System.out.println("1. Fudbal");
		System.out.println("2. Kosarka");
		System.out.println("3. Odbojka");
		
		System.out.println("Izaberite redni broj opcije: ");
		
		Scanner sc=new Scanner(System.in);
		
		int opcija=sc.nextInt();
		
		switch (opcija ) {
		
		case 1:
			System.out.println("11");
		break;
		
			
		case 2:
			System.out.println("11");
		break;
		
		
		case 3:
			System.out.println("11");
		break;
		
		default:
			
			System.out.println("los unos");
			break;
		}
	}
}




	


	
