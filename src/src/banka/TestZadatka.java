package banka;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestZadatka {
// kostruktor nije dobro postavljen,
	@Test
	public void zadatakTest() {
		//String broj ="01234";
		//String ime="Djordje";
		Double iznos=0.00;
		
		Zadatak nZ= new Zadatak("Djordje", "01234");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(nZ.getName(), "Djordje", "Pogresna vrednost imena");
		sa.assertEquals(nZ.getNumber(), "01234");
		sa.assertEquals(nZ.getAmount(), 0d);
		//nZ.setAmount(iznos);
		//sa.assertEquals(nZ.getAmount(), iznos);
		
		sa.assertAll();
		
	}
	// seter je postavljen samo za amount
	@Test
	public void zadatakTest1() {
		String broj ="01234";
		String ime="Djordje";
		Double iznos=0.00;
		
		Zadatak nZ1= new Zadatak("Djordje", "01234");
		double stanjeP=0;
		double stanjeK=1000;
		//nZ1.setAmount(iznos);
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(nZ1.getName(),ime);
		sa.assertEquals(nZ1.getNumber(),broj);
		sa.assertEquals(nZ1.getAmount(),stanjeP);
		nZ1.setAmount(stanjeK);
		sa.assertEquals(nZ1.getAmount(), stanjeK);
		
		
		sa.assertAll();
	}
	
		/*
		 * d)    Направити 100.000 налога помоћу конструктора public Account(String name) и
		 *  проверити да ли
 се сви бројеви разликују.
  */	
		
		@Test
		public void zadatakTest2Ispis() {
			Zadatak nZ2= new Zadatak("Djordje", "01234");
			String ocekivani =String.format("%s\t%s\t%.2f", nZ2.getNumber(),nZ2.getName(),nZ2.getAmount());
			
			
			/*
			String ime1="Djordje1";
			SoftAssert sa = new SoftAssert();
			
			
		for (int i=0;i<10;i++) {
			
			Zadatak nZ2= new Zadatak(ime1);
		
			sa.assertEquals(nZ2.getName(), ime1);
			System.out.println((i+1)+ ". " +nZ2.toString());
		
		}
		
		*/
	}
		@Test 
		public void testGenerisanje() {
			int max=50;
			Zadatak [] racuni=new Zadatak[max];
			for (int i=0;i<max;i++) {
				racuni[i]=new Zadatak("Djordje" + i);
			}
			for (int i=0;i<max-1;i++) {
				for (int j=i+1;j<max;j++) {
					Assert.assertNotEquals(racuni[i].getNumber(),racuni[j].getNumber());
				}
				racuni[i]=new Zadatak("Djordje" + i);
			}
		}
		/*
		 * Потребно је направити тест за исправност класе Bank. За све тестове потребно је направити јединствену 
		 * банку која се на почетку теста ресетује. Сматрати да ова банка не може да има налог код којег је стање 
		 * негативно. Ако се на основу тестова пронађе нека грешка у коду потребно је да се поправи оригинални код.
		a)     Потребно је испитати да ли адекватно ради отварање налога, тако што ће се убацити 5 налога и затим 
		испитати да ли се ти налози могу дохватити.
		b)    Проверити да ли добро ради метода за уплату новца.
		c)     Проверити да ли добро ради метода за трансфер новца.
		d)    Проверити да ли добро ради метода за рачунање укупног новца у банци (getSumMoney).
		 */
		@Test
		public void TestBanka() {
			List <Account>lista=new ArrayList <Account>();
			
			
			Account a1=new Account("12345");
			Account a2=new Account("09876");
			Account a3=new Account("3456");
			Account a4=new Account("23897");
			Account a5=new Account("120934");
			lista.add(a1);
			lista.add(a2);
			lista.add(a3);
			lista.add(a4);
			lista.add(a5);
			Bank b1=new Bank();
		}
}
