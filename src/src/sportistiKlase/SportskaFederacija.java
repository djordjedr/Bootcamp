package sportistiKlase;

/*
 * sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi. 
Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
 */
public class SportskaFederacija {

	public static void main(String[] args) {
		
		Sportista s1=new Sportista("Saban Salic", "Streljastvo");
		Sportista s2=new Sportista("Janko Jankovic", "kuglanje");
		Sportista s3=new Sportista("Ivan Ivanovic", "tenis");
		
		s1.setBrojdresa(15);
		s1.setKlub("Zvezda");
		s2.setBrojdresa(5);
		s2.setKlub("Partizan");
		s3.setBrojdresa(1);
		s3.setKlub("MGM");
		
		System.out.println(s1.getImeiPrezime()+ ", " + s1.getSport()+", " + s1.getKlub()+", " + s1.getBrojDresa() );
		System.out.println(s2.getImeiPrezime()+ ", " + s2.getSport()+", " + s2.getKlub()+", " + s2.getBrojDresa() );
		System.out.println(s3.getImeiPrezime()+ ", " + s3.getSport()+", " + s3.getKlub()+", " + s3.getBrojDresa() );
		s2.setBrojdresa(25); 
		s2.setKlub("Zvezda");

		System.out.println(s2.getImeiPrezime()+ ", " + s2.getSport()+", " + s2.getKlub()+", " + s2.getBrojDresa() );
		
		System.out.println();
		
	}

}