package Paket;

public class PrvaKlasa {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		int x =5;
		System.out.println("Vrednost promenljive je " + x);
		int y=6;
		double s=0.5;
		float t = 3.64f;
		int zbir= x + y;
		System.out.println("Zbir je "+ zbir);
		int razlika=x-y;
		System.out.println("razlika je "+ razlika);
		int proizvod = x*y;
		System.out.println("proizvod je "+ proizvod);
		/* posto treba da delimo onda makar jedna cifra mora da bude double posto bi inace 
		dobili isto integer ishod*/ 
		double u= 5.0;
		double kolicnik =x/u;
		System.out.println("kolicnik je " + kolicnik );
	}

}
