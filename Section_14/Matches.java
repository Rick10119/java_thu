// Example for PPT No.21

public class Matches
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("("+args[1]+ ") matches.("+args[0]+") is :"+args[1].matches(args[0]));
		}
		catch(Exception e)
		{
			System.out.println("Usage: Matches regex string_to_match");
		}
	}
}