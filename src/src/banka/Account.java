package banka;


	/*
	Potrebno je napraviti test za ispravnost klase Account. 
	Ako se na osnovu testova prona�e neka gre�ka u kodu potrebno je da se popravi originalnin kod.
	Proveriti da li konstruktor public Account(String name, String number) dobro postavlja argumente,
	 kao i da li get metode vra�aju odgovaraju�e vrednosti. Kada se napravi ra�un, stanje treba 
	 da bude jednako 0.
	9:02
	*/
	
	import java.util.Random;
	import java.util.UUID;
	
	public class Account {
	    private String number;
	    private String name;
	    private Double amount;
	    public Account(String name, String number){
	        this.number=number;
	        this.name=name;
	        this.amount=0d;
	    }
	    public Account(String name){
	        this(name,UUID.randomUUID().toString());
	    }
	    public String getNumber() {
	        return number;
	    }
	    public String getName() {
	        return name;
	    }
	    public Double getAmount() {
	        return amount;
	    }
	    public void setAmount(Double amount) {
	        this.amount = amount;
	    }
	    @Override
	    public String toString() {
	        return String.format("%s %s %.2f",number,name,amount);
	    }
	}

