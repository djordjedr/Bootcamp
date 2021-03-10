package klaseSportista;
	
public class Teniser extends Sportista {
	private String rang;
	public Teniser(String ime, String prezime, int godR,String rang) {
		super(ime, prezime, godR);
		this.rang=rang;
		// TODO Auto-generated constructor stub
	}
	public String getRang() {
		return rang;
	}
	public void setRang(String rang) {
		this.rang = rang;
	}

	
}
