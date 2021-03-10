package klaseSportista;

public class Kosarkas extends Sportista {
private double visina;
private String klub;

	public Kosarkas(String ime, String prezime, int godR,double visina,String klub) {
		super(ime, prezime, godR);
		this.visina=visina;
		this.klub=klub;
		// TODO Auto-generated constructor stub
	}

	public double getVisina() {
		return visina;
	}

	public void setVisina(double visina) {
		this.visina = visina;
	}

	public String getKlub() {
		return klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

}
