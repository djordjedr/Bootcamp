package knjiga;
/*
 * Napravti klasu Knjiga koja sadrzi podatke o naslovu, imenu autora i broju prodatih primeraka.
 *  U mainu napraviti nekoliko objekata klase knjiga i igrati se sa atributima tih objekata.

 */
public class Knjiga {
	private String naslov;
	private String autor;
	private int brojProdatihPrimeraka;
	private double cena;
	
	public Knjiga(String naslov, String autor, int brojProdatihPrimeraka,double cena) {
		this.naslov=naslov;
		this.autor=autor;
		this.brojProdatihPrimeraka= brojProdatihPrimeraka;
		this.cena=cena;	
	}
		
		public Knjiga (double cena) {
			this.cena=cena;	
		}
		
		public String getNaslov() {
			return naslov;
		}
		 
		public String getAutor() {
			return autor;
		}
		
		public int getbrojProdatihPrimeraka() {
			return brojProdatihPrimeraka;
		}
		
				
		public void setbrojProdatihPrimeraka() {
			
		}
		public double getCena() {
			return cena;
		}
		public  void setCena() {
			
		}
		
		
	}

	


