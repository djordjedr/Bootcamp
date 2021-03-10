package doWhile;

import java.util.Scanner;

public class DoWhile1 {
//zbir cifara
	//ako je neka cifra =5 mora da se ispise broj sadrzi 5
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int broj=sc.nextInt();
		int cilj =0;
		int sabiranje=0;
		
		do {
			cilj=broj%10;
			System.out.print(cilj);
			broj= broj/10;
			
			if (cilj==5) {
				System.out.println(" \n broj sadrzi nedozvoljenu cifru");
			break;
			
			}
			
				sabiranje= cilj + sabiranje;
				
			
			
			
		} while(broj !=0); {
			
		}
		if (cilj!=5) {
			
				System.out.println("\n" +sabiranje);
		}
	}


}
