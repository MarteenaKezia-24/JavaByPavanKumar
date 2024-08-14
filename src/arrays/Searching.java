package arrays;

public class Searching{

	public static void main(String[] args) {
		//Linear search an element in array

		int arr[] = {100,200,300,400,500};
		int search=300;			
		
		boolean status = false; //false means not found
		
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]==search)
			{
				System.out.println("element found");
				status=true;
				break;
			}
			
		}
		
		if(status==false)
		{
		System.out.println("element not found");
		}
	}
}
