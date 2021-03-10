package firma;

public class Glavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zaposleni z1=new Zaposleni("Djordje", "Djordjevic");
		z1.setPozicija("Mladji pripravnik");
		z1.setmPrimanja(100000);
		
		Zaposleni z2=new Zaposleni("Nikola", "Nikolic");
		z2.setPozicija("Stariji pripravnik");
		z2.setmPrimanja(120000);
		
		Zaposleni z3=new Zaposleni("Jovan", "Jovanovic");
		z3.setPozicija("Jos stariji pripravnik");
		z3.setmPrimanja(140000);
		
		Zaposleni z4=new Zaposleni("Marko", "Markovic");
		z4.setPozicija("Najstariji pripravnik");
		z4.setmPrimanja(160000);
		
		Zaposleni z5=new Zaposleni("Ivan", "Ivanovic");
		z5.setPozicija(" pripravnik");
		z5.setmPrimanja(60000);
		
		Zaposleni z6=new Zaposleni("Nemanja", "Nemcevic");
		z6.setPozicija("QA");
		z6.setmPrimanja(180000);
		
		Zaposleni [] lista1= {z1,z2,z3};
		Zaposleni [] lista2= {z4,z5,z6};
		
		Firma f1=new Firma("Jugoimport", "Beograd", 12345, lista1);
		
		Firma f2=new Firma("Jugotrade", "Beograd" , 9876 ,lista2);
		
		System.out.println(z1.toString());;
		
		System.out.println(f1.toString());
		
		System.out.println(f2.toString());
		
	}

}
