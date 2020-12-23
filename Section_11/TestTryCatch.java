// Example for PPT page No.10

public class TestTryCatch
{
	/** Main method with argument Y - for exception, any others - for none exception */
	public static void main(String[] args)
	{
		System.out.println("The statements before try-catch block...");
		System.out.println();
		
		try
		{
			System.out.println("Codes to try...");
			
			if(args[0].charAt(0)=='Y')
			{
				System.out.println("The Exception will be throw!");
				throw new Exception();
			}
			
			System.out.println("More codes to try...");
			System.out.println();
		}
		catch(Exception ex)
		{
			System.out.println("-----------------------------");
			System.out.println("Code to process the exception...");
			System.out.println("-----------------------------");
		}
		
		System.out.println("Other following codes...");
		System.out.println();
	}
}