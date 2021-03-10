package firma;

public class Zaposleni {
private String ime;
private String prezime;
private String pozicija;
private double mPrimanja;

public Zaposleni(String ime, String prezime) {
	super();
	this.ime = ime;
	this.prezime = prezime;
}

public String getPozicija() {
	return pozicija;
}

public void setPozicija(String pozicija) {
	this.pozicija = pozicija;
}

public double getmPrimanja() {
	return mPrimanja;
}

public void setmPrimanja(double mPrimanja) {
	this.mPrimanja = mPrimanja;
}

public String getIme() {
	return ime;
}

public String getPrezime() {
	return prezime;
}

@Override
public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(ime.toUpperCase());
	sb.append("_");
	sb.append(prezime.toUpperCase());
	sb.append(":");
	sb.append(pozicija.toUpperCase());
	sb.append("(");
	sb.append(mPrimanja);
	sb.append(")");
	return sb.toString();
}

}
