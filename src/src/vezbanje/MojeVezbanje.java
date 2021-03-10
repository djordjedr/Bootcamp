package vezbanje;

import java.util.Scanner;

public class MojeVezbanje {

	public static void main(String[] args) {
		/*
		 * Napraviti promenljivu godine koja za vrednost uzima ceo broj. U slucaju da je ta promenljiva jednaka:
7 ispisati "Prvi razred"
8 ispisati "Drugi razred"
9 ispisati "Treci razred"
10 ispisati "Cetvrti razred"
11, 12, 13 ili 14 ispisati "Stariji razredi osnovne skole"
bilo koja druga vrednost ispisati "Ne ide u osnovnu skolu."

		 */
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int godine=0;
		boolean ispravno = true;
		do {
		ispravno = true;
		System.out.println("Upisite broj godina:");
		 godine =sc.nextInt();
		 
		 switch(godine) {
		 
		 case 7:
			 System.out.println("Prvi razred");
	
			 break;
			 
		 case 8:
			 System.out.println("Drugi razred");

			 break;
			 
		 case 9:
			 System.out.println("Treci razred");
			
			 break;
			 
		 case 10:
			 System.out.println("Cetvrti razred");
			 
			 break;
			 
		 case 11:
			
		 case 12:
			 
		 case 13:
			
		 case 14:
			 System.out.println("Stariji razred osnovne skole");
			
			  break;
			  
			  default:
				  System.out.println("Ne ide u osnovnu skolu");
				  ispravno =false;
				  System.out.println(ispravno);
				 
				  
		 }
		 
		 }
		
		 while (ispravno==false);
	}

}
