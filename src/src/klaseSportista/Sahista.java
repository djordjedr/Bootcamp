package klaseSportista;

public class Sahista extends Sportista {
	private String titula;
	
	public Sahista(String ime, String prezime, int godR, String titula) {
		super(ime, prezime, godR);
		this.titula=titula;
		// TODO Auto-generated constructor stub
	}

	public String getTitula() {
		return titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

	
}
