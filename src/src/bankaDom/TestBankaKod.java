package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import banka.Account;
/*
 * Po uzoru na rad na casu (zadatak sa klasama Account i TestAccount), napraviti klasu TestBankaKod i :
proveriti da li konstruktor dobro postavlja argumente, kao i da li get metode vracaju odgovarajuce
 vrednosti. Kada se napravi racun, stanje treba da bude jednako 0.
 */
public class TestBankaKod {
	
	@Test

public void konstruktorTest() {
		
		String ime = "Djordje";
		String brojZR = "123456";
		Double suma= 234.44;
		
		BankaKod ac = new BankaKod(ime, brojZR);
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ac.dohvatiIme(), ime);
		sa.assertEquals(ac.dohvatiZiroRacun(), brojZR);
		sa.assertEquals(ac.dohvatiIznos(), 0d);
		ac.postaviIznos(suma);
		sa.assertEquals(ac.dohvatiIznos(), suma);
		String ocekivani=String.format("%s %s %.2f", ac.dohvatiZiroRacun(),ac.dohvatiIme(),ac.dohvatiIznos());
		sa.assertEquals(ac.toString(), ocekivani);
		
		sa.assertAll();
	}
	

}
