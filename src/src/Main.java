
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zaposleni z1=new Zaposleni("Ivan", "Ivkovic");
		z1.setMesecnaP(50000);
		z1.setPozicija("QA");
		
		Zaposleni z2=new Zaposleni("Milan", "Milankovic");
		z2.setMesecnaP(70000);
		z2.setPozicija("Menager");
		
		Zaposleni z3=new Zaposleni("Djordje", "Djordjevic");
		z3.setMesecnaP(80000);
		z3.setPozicija("BA");
		
		Zaposleni z4=new Zaposleni("Nemanja", "Nemanjic");
		z4.setMesecnaP(50000);
		z4.setPozicija("QA");
		
		Zaposleni[] radnici= {z1,z2,z3,z4};
		//System.out.println(z1.getIme());
		
		Firma f1=new Firma("Nevazna", "Nepoznato", 12345, radnici);
		
		System.out.println(f1.toString());
		System.out.println(f1.ispisZaposlenih(radnici));
		
		//System.out.println(z1.toString());
	}

}
