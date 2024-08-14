package Java;

public class Continue {
	public static void main(String[] args) {
		//skip 3,5,9
		for(int i=1; i<=10; i++)
			/*	{
		if(i==3)
		{
			continue;
		}
		else if (i==5)
		{
			continue;
		}
		else if(i==9)
		{
			continue;
		}
		System.out.println(i);
	} */



		{
			if(i==3 || i==5 || i==9)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}