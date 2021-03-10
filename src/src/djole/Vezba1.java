package djole;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {
/*Unose se dva broja razlicitog znaka. Napisati program koji sabira sve brojeve deljive sa 5 koji su izmedju ta dva broja
 * (i njih ukljuciti ako su deljivi sa 5
 * */
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi prvi broj:");
		int prvi= sc.nextInt();
		System.out.println("Unesi drugi broj:");
		int drugi=sc.nextInt();
		int max=0;
		int min=0;
		int zbir=0;
		if (prvi>drugi) {
			max=prvi;
			min=drugi;
		}
		else {
			min=prvi;
			max=drugi;
		}
		while (max>=min) {
			if(min % 5 == 0) {
				zbir=zbir+min;
				//System.out.println(min +" je min");
				//System.out.println(zbir +" je zbir");
			}
			
				min++;
			
			
			
		}
		System.out.println(zbir + " je rezultat");
	}

}
