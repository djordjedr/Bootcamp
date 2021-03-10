import java.time.LocalDate;
import java.util.Scanner;

public class radnik { 
	 int ID;
	 String jmbg;
	 String firstname;
	 String lastname;
	 int remainingRestDays=20;
	
	 
 radnik(){
	ID=0;
	jmbg="1103957715017";
	firstname="Snežana";
	lastname="Zekoviæ";
	remainingRestDays=20;
	
}
	public static void main(String[] args) {
		
		
		Scanner radnik = new Scanner(System.in);
				
		System.out.println("Unesite jmbg, ime i prezime: ");
		
		
	String jmbg= radnik.nextLine();
	}
	
	radnik(int id, String jmbg, String firstname, String lastname, int remainingRestDays){
		
		this.jmbg=jmbg;
		this.firstname=firstname;
		thih.lastname=lastname;
		this.remainingRestDays=remainingRestDays;
		
	}
	
	 {
		System.out.println(" ");
		
		//break;
		}
		
	
	
	
	
	String firstname= radnik.nextLine();
	
	Stringlastname= radnik.nextLine();
	
	System.out.println("Vas jmbg je: "+ jmbg);
	
	System.out.println("Vase ime je: " + firstname);
	
	System.out.println("Vase prezime je: "+lastname);
	
		
		
		}

}


int jmbgIspravan() 
{
	int i;
	if (jmbg.length() == 13) return 0
	else
		return 1
}
 