package string;

public class ReverseAString {
	public static void main(java.lang.String[] args) {
	String s = "marteena";
	String rev ="";
	
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.print(rev);
	}
	
}
