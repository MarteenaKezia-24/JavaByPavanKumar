package arrays;

public class SignleDimensional {

	public static void main(String[] args) {
		/*		int a[]= new int[5];
//declaring the variable
//Approach1 - if you the information how many values need to be stored
		a[0]=100; //adding the values to index 
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500; 
		 */

		//Approch2 - if you don't have any plan to add an array	
		/*		int b[] = {100,200,300,400,500};
		int size=b.length;
		System.out.println(size);	//length of an array

		 */

		//how to read data from array
		//for(int a=0; a<b.length; a++) 	< a.lenght is enough

		int b[] = {100,200,300,400,500};
		for(int a=0; a<=b.length-1; a++) 	//<= a.length is fine
		{
			System.out.println(b[a]);
		}
	}

}
