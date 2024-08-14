package arrays;

public class TwoDimensional {
	public static void main(String[] args) {

		//Approach1 - if you already know how many to store and no need to add any row/column
		//		int [][]a=new int[3][2];
		//		int []a[]=new int[3][2];

		/*	int a[][]=new int[3][2];	//creates 3 rows and 2 columns
		a[0][0]=100;
		a[0][1]=200;

		a[1][0]=300;
		a[1][1]=400;

		a[2][0]=500;
		a[2][1]=600;
		 */

		//Approach2 - 	
		//		int a[][] = {{100,200}, {300,400}, {500,600}};
		//		System.out.println(a.length);   //size of an array
		//		System.out.println("size of an array:" + a[1].length);


		//read the values from the array
		int a[][] = {{100,200}, {300,400}, {500,600}};
//		System.out.println(a[2][1]);	//600

		for(int row=0; row<=a.length-1; row++)		//print all rows based on length
		{
			for(int col=0; col<=a[row].length-1; col++)	// print all columns based on rows
			{
//				System.out.println(a[row][col]);
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
}

