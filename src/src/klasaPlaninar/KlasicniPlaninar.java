package klasaPlaninar;

public class KlasicniPlaninar extends Planinar {
	private boolean penjiSe;
	
	
	public KlasicniPlaninar(String ime, String prezime, String zemljaP) {
		super(ime, prezime, zemljaP);
		
	}

	public boolean penjiSe(int visina) {
		boolean popeoSe=false;
		if(visina<=2000) {
			popeoSe=true;
		}
		return popeoSe;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("K_").append(super.toString());
		
		return sb.toString();
	}

	
	
}
