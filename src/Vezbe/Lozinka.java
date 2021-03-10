package Vezbe;

import java.util.Scanner;

public class Lozinka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String lozinka="zlatibor";
			
			String lozinka1="tara";
			
			
			Scanner sc= new Scanner(System.in);
			
			
			
			do {
				System.out.println("unesi lozinku:");
				String pokusaj= sc.nextLine();
				
				String malaslova=pokusaj.toLowerCase();                  
				
				
			
			if (malaslova.equals(lozinka) || malaslova.equals(lozinka1) ) {
				System.out.println("pogodio si lozinku");
				break;
			}
			else {
				System.out.println("nisi pogodio lozinku");
			}
			}
			while(true);
			
	}

}
