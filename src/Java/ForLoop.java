package Java;

public class ForLoop {
	public static void main(String[] args) {
//print even number btwn 1 to 10
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
			{
			System.out.println(+i+ " " + "even");
			}
			else
			{
				System.out.println(+i+ " " + "odd");
			}
		}
	}
}
