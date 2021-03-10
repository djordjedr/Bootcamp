package firma;

import java.util.Arrays;

public class Firma {
	private String naziv;
	private String sediste;
	private int PIB;
	private Zaposleni[] nZaposlenih;
	
	public Firma(String naziv, String sediste,int PIB,Zaposleni[] nZaposlenih) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		this.PIB=PIB;
		this.nZaposlenih=nZaposlenih;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public int getPIB() {
		return PIB;
	}

	public Zaposleni[] getnZaposlenih() {
		return nZaposlenih;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("\n");
		sb.append("Firma naziva ");
		sb.append(naziv.toUpperCase());
		sb.append(" sa sedistem u ");
		sb.append(sediste.toUpperCase());
		sb.append("-u  PIB broj ");
		sb.append(PIB);
		sb.append(" Ima zaposlene: ");
		for(int i=0;i<nZaposlenih.length;i++) {
			sb.append("\n");
			sb.append(nZaposlenih[i]);
			
		}
		return sb.toString();
				/*"Firma [naziv=" + naziv + ", sediste=" + sediste + ", PIB=" + PIB + ", nZaposlenih="
				+ Arrays.toString(nZaposlenih) + "]";
				*/
	}
	
	
}
