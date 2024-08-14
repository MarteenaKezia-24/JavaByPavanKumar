package arrays;

import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
/*		int arr[] = {400,300,200,100,600,700,500};
		
		System.out.println("before sorting");
//for printing all array elements
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(arr));
		*/
		
		String s[]= {"D", "C", "B", "A"};
		
		System.out.println("before sort" +Arrays.toString(s));
		
		Arrays.sort(s);
		System.out.println("after sorting" +Arrays.toString(s));
	}
}
