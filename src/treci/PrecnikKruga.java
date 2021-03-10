package treci;

import java.util.Scanner;

public class PrecnikKruga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unesite poluprecnik kruga:");
			Scanner ulaz=new Scanner(System.in);
			int r= ulaz.nextInt();
			if (r<=0) {
				System.out.println("niste uneli validnu vrednost");
			}
			else {
				double povrsina= r *r* 3.14;
				System.out.println("Pvrsina kruga iznosi: "+ povrsina);
				if (povrsina < 80) {
					System.out.println("krug je mali");
				}
			}
			
	}

}
