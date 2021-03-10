package djole;

import java.util.Scanner;

public class PetljaZbir {

	public static void main(String[] args) {
		/*unesi pocetnu i krajnju cifru, saberi sve cifre,
		 *  a kasnije ih i pomnozi
		 */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi prvu broj:");
		int n1=sc.nextInt();
		System.out.println("Unesi drugi broj:");
		int n2=sc.nextInt();
		int zbir=0;
		int proizvod=1;
		int min=0;
		int max=0;
		if (n1>n2) {
			max=n1;
			min=n2;
		}
		else {
			max=n2;
			min=n1;
			
		}
		while (max>=min) {
			zbir=zbir+min;
			proizvod=proizvod*min;
			min++;
			
		}
		System.out.println("Proizvod iznosi: "+ proizvod);
		System.out.println("Zbir iznosi: "+ zbir);
	}

}
