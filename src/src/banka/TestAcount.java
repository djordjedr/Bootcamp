package banka;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAcount {
	/*
	 * Proveriti da li konstruktor public Account(String name, String number) dobro postavlja argumente,
	 kao i da li get metode vraæaju odgovarajuæe vrednosti. Kada se napravi raèun, stanje treba 
	 da bude jednako 0.
	 */
	@Test
	public void testirajKonstruktor() {
		
		String ime = "Tijana";
		String broj = "123456";
		
		Account ac = new Account(ime, broj);
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ac.getName(), ime);
		sa.assertEquals(ac.getNumber(), broj);
		sa.assertEquals(ac.getAmount(), 0d);
		
		
		sa.assertAll();
	}
}