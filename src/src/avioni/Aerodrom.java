package avioni;

public class Aerodrom {

	public static void main(String[] args) {


		Avion cesna172=new Avion ("Cesna", "172", 200, 4, 1, 160.5, 40);
		Avion  PiperSaratoga=new Avion ("Piper", "Saratoga", 320,  6, 2, 400, 75);
		
		System.out.println("Dolet aviona " + cesna172.getProizvodjac() + " iznosi " + cesna172.dolet() + " km" );
	}

	
}
