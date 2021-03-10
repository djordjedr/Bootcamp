package klaseSportista;

public class Sportista {
	private String ime;
	private String prezime;
	private int godR;
	
	public Sportista(String ime, String prezime, int godR) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.godR = godR;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getGodR() {
		return godR;
	}

	public void setGodR(int godR) {
		this.godR = godR;
	}
	
	
}
