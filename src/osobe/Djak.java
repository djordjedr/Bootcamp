package osobe;

public class Djak extends Osoba {
	private String skola;
	private int razred;

	public Djak(String ime, String prezime, String adresa,String skola,int razred) {
		super(ime, prezime, adresa);
		this.skola=skola;
		this.razred=razred;
		// TODO Auto-generated constructor stub
	}

	public String getSkola() {
		return skola;
	}

	public void setSkola(String skola) {
		this.skola = skola;
	}

	public int getRazred() {
		return razred;
	}

	public void setRazred(int razred) {
		this.razred = razred;
	}

}
