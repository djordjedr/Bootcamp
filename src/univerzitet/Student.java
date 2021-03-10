package univerzitet;

public class Student {

	private String ime;
	private String prezime;
	private String brojIndeksa;
	private int godinaUpisa;
	private double prosek;
	
	public Student (String ime, String prezime, String brojIndeksa, int godinaUpisa, double prosek) {
		this.ime = ime;
		this.prezime=prezime;
		this.brojIndeksa=brojIndeksa;
		this.godinaUpisa=godinaUpisa;
		this.prosek=prosek;
	}
	
	

	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public String getbrojIndeksa() {
		return brojIndeksa;
	}
	
	public int getgodinaUpisa() {
		return godinaUpisa;
	}
	
	public double getprosek() {
		return prosek;
	}
	
	public void setprosek() {
		
	}
	
}
