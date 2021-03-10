package osmi;

public class Funkcije {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		int c=10;
		System.out.println(a+b);
		a=7;
		b=8;
		ispisi();
		System.out.println(a+b);
		c=saberi(a,a,a);
		

	}
	public static void ispisi() {
		int a=10; //nije isto a kao u main-u
		System.out.println("Dobar dan!" + a);
	}
	public static int saberi(int prviBroj, int drugiBroj, int treciBroj) {
		int zbir=prviBroj + drugiBroj + treciBroj;
		System.out.println(prviBroj+drugiBroj+treciBroj);
		prviBroj=0;
		return zbir;
	}
  public static void prikazi (String rec, int broj) {
	  System.out.println(rec + "" + broj);
	  String s1=rec.toLowerCase();
  }
  
}
