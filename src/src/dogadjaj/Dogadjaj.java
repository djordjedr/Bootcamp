package dogadjaj;

public class Dogadjaj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grad g1=new Grad("Beograd");
		Grad g2=new Grad("Jagodina");
		Grad g3=new Grad("Nis");
		Grad g4=new Grad("Titovo Uzice");
		
		Tip t1= new Tip("Koncert");
		Tip t2= new Tip("Utakmica");
		Tip t3= new Tip("Vencanje");
		
		Dvorana d1=new Dvorana("Arena", g1, 1000);
		Dvorana d2=new Dvorana("Chair", g3, 700);
		Dvorana d3=new Dvorana("Palma", g2, 1000);
		
		Event e1=new Event ("10:00", t1, d1);
		Event e2=new Event ("21:00",t2,d2);
		
		
	}

}
