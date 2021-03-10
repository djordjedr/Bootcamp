package planinarenje;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Planinar p1=new Planinar("Misa", "Misic", "Srbije");
		Planinar p2=new Planinar("Nikola", "Nisic", "Srbije");
		Alpinista a1=new Alpinista("Svetlana", "Svetlanovic", "Srbija");
		Alpinista a2=new Alpinista("Milan", "Milic", "Srbija");
		Alpinista a3=new Alpinista("Nemanja", "Nemcevic", "Srbija");
		a1.setPartner(a2);
		a2.setPartner(a1);
		
		List <Planinar> ListaPlaninara= new ArrayList<Planinar>();
		ListaPlaninara.add(p1);
		ListaPlaninara.add(p2);
		
		
		
		Planina pl1= new Planina("Crni vrh", 2000, "strma", ListaPlaninara);
		Planina pl2= new Planina("Beli vrh", 3000, "strma", ListaPlaninara);
	}

}
