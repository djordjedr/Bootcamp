package figure;

public class Trougao extends GeometrijaFigura {
	private double a;
	private double b;
	private double c;
	
	public Trougao(int x, int y,double a, double b, double c) {
		super(x, y);
		this.a=a;
		this.b=b;
		this.c=c;
		
		// TODO Auto-generated constructor stub
	}

	public void Obim() {
		double s=(a+b+c)/2; //heronov obrazac
		System.out.println("s je "+ s);
		System.out.println("Povrsina je: " + Math.sqrt(s*(s-a))); 
	}
	
	public void Povrsina() {
		System.out.println("Obim je: " +  (a+b+c));
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

}
