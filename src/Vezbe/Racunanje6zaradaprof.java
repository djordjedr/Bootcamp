package Vezbe;

import java.util.Scanner;

public class Racunanje6zaradaprof {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double plata=0;
		for (int i=1;i<6;i++) {
			System.out.println("unesite "+ i+ ". platu");
			plata=sc.nextDouble();
			while(plata<0) {
				System.out.println("uneli ste nevalidnu vrednost");
				plata=sc.nextDouble();
			}
			if(plata==0) {
				break;
			}
		}

	}

}
