package string;

import java.util.Arrays;

public class StringMethods {

	public static void main(java.lang.String[] args) {
		//length											string declaration
		/*			String s = "Welcome";				
			System.out.println(s.length());				//7
			System.out.println("Marteena".length());	//8 */

		//concat
		/*			String s1 = "marteena";
			String s2 = "Kezia";
			String s3 = "Sreeram";
			System.out.println(s1+s2);
			System.out.println(s1.concat(s2).concat(s3));
			String s = s1.concat(s2);
			System.out.println(s.concat(s3));	// adding multiple strings
			System.out.println(s1.concat(s2).concat(s3)); */

		//Trim
		/*			String s = "   Marteena   ";
			System.out.println("befor" + " " +s.length());
			System.out.println(s);
			System.out.println(s.trim());
			System.out.println(s.trim().length());
		 */

		//charAt()
		/*		String s = "marteena";
		System.out.println(s.charAt(3));
		 */

		//contains()
		/*		String s = "marteena kezia sreeram";
//		System.out.println(s.contains("kezia"));
		if(s.contains("marteena"))
		{			
			System.out.println("marteena is part of s string");
		}
		else
			System.out.println("marteena not part of s string");
		 */
		//Equals 
		/*		String s1 = "marteena";
		String s2 = "Marteena";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		 */

		//replace()
		/*		String s = "marteena";
		System.out.println(s.replace('e', 'i'));	//single char
		System.out.println(s.replace("marteena", "kezia")); //multiple character */

		//subString() //toLowerCase() //toUpperCase()
		/*		String s = "marteena";
		System.out.println(s.replace("m", "M").substring(0, 6));
		String s1 =(s.toUpperCase());
		System.out.println(s1);
		System.out.println(s1.toLowerCase()); */

		//split()
/*		String s = "marteena.kezia@gmail.com";
		String a[] =s.split("@");	//space,dot,@ are the delimiter //based on delimiter we can split multiple parts and store it in single dimentional array
		System.out.println(a[0]);
		System.out.println(Arrays.toString(a)); 
		
		String s = "$21,20,24";				//expected -212024
		System.out.println(s.replace("$", " ").replace(",", "")); */
		
		String s = "marteena,kezia@gmail";
		String a[] = s.split(",");
		System.out.println(Arrays.toString(a));
		String a1[] = a[1].split("@");
		System.out.println(Arrays.toString(a1));
		System.out.println(a[0] + " " + a1[0] + " " + a1[1]);
	}

}
