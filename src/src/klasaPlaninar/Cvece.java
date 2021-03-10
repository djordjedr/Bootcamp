package klasaPlaninar;


public class Cvece {
	private String nazivC;
	private String boja;
	
	public Cvece(String nazivC, String boja) {
		
		this.nazivC = nazivC;
		this.boja = boja;
	}

	public String getNazivC() {
		return nazivC;
	}
	public String getBoja() {
		return boja;
	}
	
	

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Naziv cveta je: ").append(nazivC).append(boja);
		
		return sb.toString();
	}
		
	

}
