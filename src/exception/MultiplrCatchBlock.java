package exception;

public class MultiplrCatchBlock {

public static void main(String[] args) {
		String s= "welcome"; 	
		try
			{
			System.out.println(s.length());
			Thread.sleep(2000);
			}

		catch (Exception e)
			{
			System.out.println("handled try block exception");
			System.out.println(e.getMessage());
			}
		finally 
			{
			System.out.println("you entered into fianlly block");
			}
	}

}
