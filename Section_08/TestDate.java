// Example for PPT page No.28

public class TestDate
{
	public static void main(String[] args)
	{
		int hours=Integer.parseInt(args[0]);
		
		java.util.Date date=new java.util.Date();
	
		// Get the current date and time and print it
		System.out.println("The current  date and time is: "+date.toString());
		System.out.println("The current  date and time is: "+date.getTime());

		// Set time to next hour
		date.setTime(date.getTime()+hours*3600000);
		System.out.println("The modified date and time is: "+date.toString());
	}
}