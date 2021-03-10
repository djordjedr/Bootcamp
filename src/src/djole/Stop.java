package djole;

import java.util.Scanner;

public class Stop {

	public static void main(String[] args) {
		/*
		 * Napisati program koji omoguciti korisniku da unosi reci, sve dok ne unese rec
		 * “stop”, nebitno da li je koristio mala, velika slova ili kombinaciju. Mozete
		 * pri radu koristiti petlju po izboru
		 */

		String stop = "stop";
		String malo;
		String ulaz;
		String prekidac;
		String malip;
		String taster;
		int sport=0;
		int klub=0;

		do {

			System.out.println("Dobrodosli u meni");
			System.out.println("za prvu opciju upisite  \"jedan\" ");
			System.out.println("za drugu opciju upisite  \"dva\" ");
			System.out.println("za trecu opciju upisite  \"tri\" ");
			System.out.println("za izlaz upisite  \"stop\" ");
			Scanner sc = new Scanner(System.in);
			ulaz = sc.nextLine();
			malo = ulaz.toLowerCase();
			malip=ulaz.toLowerCase();
				
			switch(malip) {
			
			case "jedan":
				
				System.out.println("prva opcija");
				System.out.println("unesite zeljeni sport:");
				System.out.println("1 za fudbal");
				System.out.println("2 za kosarku");
				System.out.println("3 za vaterpolo");
				sport=sc.nextInt();
				
					switch(sport) {
					
					case 1:
						System.out.println("odaberite klub na koji zelite da se kladite:");
						System.out.println("1,2,3");
						klub=sc.nextInt();
						
						switch(klub) {
						case 1:
							System.out.println("mancester junajted");
							break;
							
						case 2:
							System.out.println("lacio");
							break;
							
						case 3:
							System.out.println("barselona");
							break;
						
						}
						
					}
				
				break;
				
			case "dva":
				System.out.println("druga opcija");
				break;
				
			case "tri":
				System.out.println("treca opcija");
					}
		}

		while (!malo.equals(stop));

		
		
		
	}

}