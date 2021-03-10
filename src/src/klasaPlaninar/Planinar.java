package klasaPlaninar;

public class Planinar {
	private String ime;
	private String prezime;
	private String zemljaP;
	
	public Planinar(String ime, String prezime, String zemljaP) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.zemljaP = zemljaP;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public String getZemljaP() {
		return zemljaP;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(ime);
		sb.append("-");
		sb.append(zemljaP);
		
		return sb.toString();
	}
	
	
}
