package metode;

import java.util.Scanner;

public class Metode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Metode1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja) i taj 
		 * program treba da pozove i 
		 * ispise (u mainu) najmanji od ta tri unesena broja.

		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("unesite prvi broj: ");
		int broj1=sc.nextInt();
					
		System.out.println("unesite drugi broj: ");
		int broj2=sc.nextInt();
		
		System.out.println("unesite treci broj: ");
		int broj3=sc.nextInt();
		
		najmanji(broj1,broj2,broj3);
		
		najmanji(broj1,broj2,broj3);
	}
	public static void najmanji(int prviBroj,int drugiBroj,int treciBroj) {
		
		int min=prviBroj;
		if (drugiBroj<min)
		{
			min=drugiBroj;
			
		}
		if (treciBroj<min) {
			min=treciBroj;
		}
		System.out.println("minimum je " + min);
		
		
		
	}
	

}
