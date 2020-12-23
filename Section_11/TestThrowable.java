// Example for PPT page No.19

public class TestThrowable
{
	/** Main method with args, Y - for exception */
	public static void main(String[] args)
	{
		System.out.println("Before try-catch block...");
		System.out.println();
		
		try
		{
			System.out.println("Before invoke p()");
			p(args[0].charAt(0));
			System.out.println("After invoke p()");
		}
		catch(SampleException ex)
		{
			System.out.println("Begin processing exception -----");
			
			System.out.println("ex.getMessage():");
			System.out.println(ex.getMessage());
			System.out.println();
			
			System.out.println("ex.toString():");
			System.out.println(ex.toString());
			System.out.println();
			
			System.out.println("ex.printStackTrace():");
			ex.printStackTrace();
			System.out.println();
		}
		
		System.out.println();
		System.out.println("After try-catch block...");
	}
	
	private static void p(char c) throws SampleException
	{
		if(c=='Y')
		{
			System.out.println("Throw the exception!");
			throw new SampleException();
		}
		else
		{
			System.out.println("No exception throw");
		}
	}
}