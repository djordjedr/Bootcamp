package dogadjaj;
/*
 * Napraviti klasu event koja sadrzi podatke o vremenu, mestu odrzavanja dogadjaja i tip (koncert, utakmica, vencanjeù)

Napraviti klasu dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i kapacitetu (broju mesta).

Uvezati ove dve klase i u glavnom programu se igrati sa njima.

 */
public class Dvorana {
	private String naziv;
	private Grad grad;
	private int kapacitet;
	
	public Dvorana(String naziv, Grad grad, int kapacitet) {
		this.naziv=naziv;
		this.grad=grad;
		this.kapacitet=kapacitet;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Grad getGrad() {
		return grad;
	}

	public void setGrad(Grad grad) {
		this.grad = grad;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
}
