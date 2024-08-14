package arrays;

public class FindNumbOfRepetation {
	public static void main(String[] args) {

		int arr[] = {100,200,200,300,400,500,500};
		int num=200;
		int count=0;
		
		for (int value : arr)
		{
			if(value==num)
			{
				count++;
			}
		}
		
			System.out.println(count);
	}
}
