package djole;

import java.util.*;

public class proba {
	public static void main(String[] args) {
		int inc;
		double cm;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("Uneti vrednost");
		inc = tastatura.nextInt();
		cm = inc * 2.54;
		System.out.println( inc + " inca iznosi " + cm + " cm");
	}

}
