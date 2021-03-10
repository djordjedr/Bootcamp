package dogadjaj;
/*
 * Napraviti klasu event koja sadrzi podatke o vremenu, mestu odrzavanja dogadjaja i tip (koncert, utakmica, vencanjeù)

Napraviti klasu dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i kapacitetu (broju mesta).

Uvezati ove dve klase i u glavnom programu se igrati sa njima.

 */
public class Event {
	private String vreme;
	private Tip tip;
	private Dvorana dvorana;
	
	public Event(String vreme,  Tip tip,Dvorana dvorana) {
		this.vreme=vreme;
		this.tip=tip;
		this.dvorana=dvorana;
	}

	public String getVreme() {
		return vreme;
	}

	public void setVreme(String vreme) {
		this.vreme = vreme;
	}

	public Tip getTip() {
		return tip;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}
	
}
