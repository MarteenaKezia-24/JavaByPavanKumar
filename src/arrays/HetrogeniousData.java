package arrays;

public class HetrogeniousData {
	public static void main(String[] args) {
		Object a[]= {100, 10.5, 'A', "Welcome", true};	
		
		for (Object x : a)		//read data from 1D of object type array
		{
		System.out.println(x);	
		}
	}

}
