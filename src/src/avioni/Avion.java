package avioni;

public class Avion {

	private String proizvodjac;
	private String model;
	private int brzina;
	
	private int brojPutnika;
	private int brojMotora;
	private double kapacitetRezervoara;
	private double potrosnjaGoriva;
	
	
	public Avion (String proizvojac, String model, int brzina,int intbrojPutnika, int brojMotora, double kapacitetRezervoara,
			double potrosnjaGoriva) {
		this.proizvodjac=proizvodjac;
		this.model=model;
		this.brzina=brzina;
		
		this.brojPutnika=brojPutnika;
		this.brojMotora=brojMotora;
		this.kapacitetRezervoara=kapacitetRezervoara;
		this.potrosnjaGoriva=potrosnjaGoriva;
		
		
	}


	


	public double getKapacitetRezervoara() {
		return kapacitetRezervoara;
	}


	public void setKapacitetRezervoara(double kapacitetRezervoara) {
		this.kapacitetRezervoara = kapacitetRezervoara;
	}


	public String getProizvodjac() {
		return proizvodjac;
	}


	public String getModel() {
		return model;
	}


	public int getBrzina() {
		return brzina;
	}


	public int getBrojPutnika() {
		return brojPutnika;
	}


	public int getBrojMotora() {
		return brojMotora;
	}


	public double getPotrosnjaGoriva() {
		return potrosnjaGoriva;
	}
	public double dolet() {
		double d=kapacitetRezervoara/potrosnjaGoriva;
		return d;
	}
}
