package nacija;
/*
 * Napraviti klasu Kontinen. Sadrzi podatke o imenu kontinenta i dominantnoj rasi.
 *  Uvezati ga sa klasom drzava.
 */
public class Kontinent {
	private String ime;
	private String rasa;
	
	public Kontinent(String ime, String rasa) {
		this.ime=ime;
		this.rasa=rasa;
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	

}
