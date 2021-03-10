package djole;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		/*
		 * DoWhile2: Napisati program koji ce korisniku ispisati poruku da li je ceo
		 * pozitivan broj koji je uneo palindrom ili nije palindrom. (palindromi -> isto
		 * mu dodje citali sleva nadesno ili s desne na levu stranu).
		 * 
		 */
		System.out.println("unesite pozitivan ceo broj:");
		Scanner sc=new Scanner(System.in);
		int unos=sc.nextInt();
		int pravi=unos;
		int provera=0;
		int citac=0;
		int obrnuti=0;
		
		if(unos>0) {
			 

			while(pravi>0){
				
			citac=pravi%10;
			System.out.println("citac je "+ citac);
			obrnuti=10*obrnuti+citac;
			System.out.println("obrnuti je " + obrnuti );
			pravi=pravi/10;
			System.out.println("pravi " + unos);
			}
			
				if(obrnuti==unos) {
					System.out.println("broj je palindrom");
				}
				else {
					System.out.println("broj nije palindrom");
				}
		}
		else {
			System.out.println("broj mora biti veci od nule");
		}
	}

}
