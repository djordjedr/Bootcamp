import java.util.Scanner;

public class While2 {

	/*
	 * While2: Napisati program koji ce na standardnom izlazu ispisati poruku Laku
	 * noc! onoliko puta koliko je korisnik zadao preko konzole. Primer: ako
	 * korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko puta zelite da se pozeli laku noc:");
		int a = sc.nextInt();
		int sum = 0;

		while (sum < a) {
			sum++;
			System.out.println("Laku noc!"); 

		}

	}

}
