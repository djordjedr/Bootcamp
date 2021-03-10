package treci;

import java.util.Scanner;

public class SwitchVezba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napraviti promenljivu godine koja za vrednost uzima ceo broj. U slucaju da je ta promenljiva jednaka:
7 ispisati "Prvi razred"
8 ispisati "Drugi razred"
9 ispisati "Treci razred"
10 ispisati "Cetvrti razred"
11, 12, 13 ili 14 ispisati "Stariji razredi osnovne skole"
bilo koja druga vrednost ispisati "Ne ide u osnovnu skolu."
		 */
		
			Scanner ulaz=new Scanner(System.in);
			System.out.println("Unesite godine");
			int godine=ulaz.nextInt();
			
			
			switch(godine)
			{
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
					System.out.println("unesite 1 za muško, a 2 za žensko");
					int p=ulaz.nextInt();
					if(p==1) {
						System.out.println("Dete je muškog pola");
					}
						
					else {
						
				
						if(p==2) {
							System.out.println("Dete je zenskog pola");
						}	
					
						else {
							System.out.println("nevalidan unos");
					}
					}
								
				break;
			case 11:
			case 12:
			case 13:
			case 14:
				
				System.out.println("Stariji razredi osnovne skole");
				break;
				default:
				System.out.println("Ne ide u osnovnu skolu.");
			}
			
	}

}
