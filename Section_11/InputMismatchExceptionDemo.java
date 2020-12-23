// Example for PPT page No.5

import java.util.*;

public class InputMismatchExceptionDemo
{
	public static void main(String[] args)
	{
		// Declare the scanner
		Scanner input=new Scanner(System.in);
		
		boolean continueInput=true;

		do
		{
			try
			{
				System.out.print("Please enter an integer: ");
				int number=input.nextInt();
				
				// Display the result when the number is entered successfully
				System.out.println("The number you entered is: "+number);
				
				continueInput=false;
			}
			catch(InputMismatchException ex)
			{
				System.out.println("Try again.(Incorrect input: an integer is required)");
				input.nextLine(); // discard input
			}
		} while(continueInput);
	}
}