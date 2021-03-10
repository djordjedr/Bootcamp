package superKlase;

public class Stanar extends Osoba {
	private String adresa;
	private int kvadratura;
	
	public Stanar(String ime, String prezime, int brojG, char pol,String adresa,int kvadratura) {
		super(ime, prezime, brojG, pol);
		this.adresa=adresa;
		this.kvadratura=kvadratura;
		
		
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public int getKvadratura() {
		return kvadratura;
	}

	public void setKvadratura(int kvadratura) {
		this.kvadratura = kvadratura;
	}

	@Override
	public String toString() {
		
		
		StringBuilder sb=new StringBuilder();
		sb.append("Osoba imena ");
		sb.append(super.getIme());
		sb.append(" ");
		sb.append(super.getPrezime());
		sb.append(" pola ");
		sb.append(super.getPol());
		sb.append(" godista ");
		sb.append(super.getBrojG());
		sb.append(" zivi na adresi");
		sb.append(adresa);
		sb.append(" koja je kvadrature " );
		sb.append(kvadratura);
	
		
		return sb.toString();
				/*"Stanar [adresa=" + adresa + ", kvadratura=" + kvadratura + ", ime=" + ime + ", prezime=" + prezime
				+ ", brojG=" + brojG + ", pol=" + pol + "]";
		
			*/	
	}
	
	
}
