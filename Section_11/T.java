// Example for PPT page No.20

public class T
{
	public static void main(String[] args) throws SampleException
	{
		System.out.println("T -- before try");
		try
		{
			TestMoreExceptions.main(args);
			System.out.println("T -- code after invoke TestMoreExceptions");
		}
		catch(SampleException ex)
		{
			System.out.println("T -- catched exception");
			System.out.println(ex.getMessage());
		}
		System.out.println("T -- after try");
	}
}