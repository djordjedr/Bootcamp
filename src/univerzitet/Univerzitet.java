package univerzitet;

public class Univerzitet {

	public static void main(String[] args) {
	
		Student s1=new Student("Slavko","Slavkic","1948/0001", 1948, 6.7);
		Student s2 =new Student("Mirko","Mirkic","1950/371", 1950,7.7);
		
		System.out.println("godina upisa studenta " + s1.getIme()+  " " + s1.getPrezime() + " je " + s1.getgodinaUpisa() + ".");
		System.out.println("godina upisa studenta " + s2.getIme()+  " " + s2.getPrezime() + " je " + s2.getgodinaUpisa() + ".");
		//s1.setprosek(6);
	}

}
