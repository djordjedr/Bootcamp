package pravljenjeStringova;

public class PravljenjeStringova {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		sb.append("ja ");
		sb.append("volim ");
		sb.append("cokoladu");
		System.out.println(sb.toString());
		String a=sb.substring(3, 8);
		System.out.println(a);
		sb.insert(3, "ne ");
		System.out.println(sb.toString());
		sb.replace(3, 6, "mnogo ");
		//String s=sb.toString();
		System.out.println(sb.toString());
		
		sb.delete(3,9);
	
		System.out.println(sb.toString());
		//System.out.println(s);
		
		//sb.charAt(1);
		System.out.println(sb.charAt(0));
		
	}

}
