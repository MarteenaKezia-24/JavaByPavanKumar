package string;

public class StringBuffer {

	public static void main(String[] args) {
		//mutable
		String s = new String("Marteena");
		s.concat("kezia");
		System.out.println(s);

		//Immutable
		StringBuilder sb = new StringBuilder("Marteena");
		sb.append("Kezia");
		System.out.println(sb);
		
//		Immutable
//		StringBuffer sb1=new StringBuffer("Marteena");
//		sb1.append("Kezia");
//		System.out.println(sb1);
	}

}
