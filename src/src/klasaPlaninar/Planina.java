package klasaPlaninar;

import java.util.List;
import java.util.Scanner;

public class Planina {
	private String ime;
	private int visina;
	private Cvece[] pc;
	private List<Planinar> listaPlaninara;
	
	
	public Planina(String ime, int visina, Cvece[] pc, List<Planinar> listaPlaninara) {
		super();
		this.ime = ime;
		this.visina = visina;
		this.pc= pc;
		this.listaPlaninara = listaPlaninara;
		
	}
	

	public Cvece[] getPc() {
		return pc;
	}



	public void setPc(Cvece[] pc) {
		this.pc = pc;
	}



	public void ispisPC() {
		for (int i=0;i<pc.length;i++) {
			System.out.println(pc[i]);
		}
	}
	public String getIme() {
		return ime;
	}

	public int getVisina() {
		return visina;
	}

	public List<Planinar> getListaPlaninara() {
		return listaPlaninara;
	}
	public int brojPlaninara() {
		return listaPlaninara.size();
		
	}
	public void brisiPlaninara(Planinar p) {
		 listaPlaninara.remove(p);
		
	}
	
	
	public void ispisPlaninara() {
		for(int i=0; i<listaPlaninara.size();i++) {
			System.out.println(listaPlaninara.get(i).toString());
			
		}
	}
	
	public void dodajPlaninara(Planinar p) {
		listaPlaninara.add(p);
	}

	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(ime).append(" ").append(visina);
		return  sb.toString();
	}
	

		
	}
	

