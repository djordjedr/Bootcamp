package projekat;

public class Funkcije1 {

	public static void main(String[] args) {
		
		int proizvod=pomnozi(15,11);
		
		System.out.println(proizvod);
		
		proizvod=30;
		
		System.out.println(proizvod);
		
		proizvod=pomnozi(12,13);
		
		
		int r= parni(2,4);
		System.out.println(r);
		int m=maks(2,3);
	}

	
	
	public static int pomnozi(int a, int b) {
		int c =a*b;
		System.out.println(c);
		return c;
	}
	
	public static int maks (int a, int b) {
		if (a<b) {
			return b;
		}
		else {
			return 1;
		}
	}
		
		public static int parni ( int x , int y ) {
			if (x % 2 ==0 && y % 2 == 0) {
				return 1;
			}
			else {
				return 0;
			}
		} 
	}
	

