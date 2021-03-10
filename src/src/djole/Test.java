package djole;

public class Test {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			if (i%3==1) {
				continue;
			}
			System.out.println(i+" ");
			if(i==4) {
				break;
			}
		}

	}

}
