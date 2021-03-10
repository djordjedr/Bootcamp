package treci;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char pol='k';
		switch(pol)
		{
		case'm':
			System.out.println("Jaci pol");
			int a=12;
			break;
		case 'z':
		case 't':	//Ovde ce pisati isto što pise i za zenski pol, posto nemamo break
			System.out.println("Lepsi pol");
			break;
		case 'u':
			System.out.println("Ako je pod U onda ce pisati i default zato sto nemamo break");
		default:
			System.out.println("Ovo je medjupol");
		}
	}

}
