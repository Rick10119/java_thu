// Example for PPT page No.5

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuotientWithException
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);

		//Prompt the user to enter two integers
		System.out.print("Enter two integers: ");



		try
		{

			int number1=input.nextInt();
			int number2=input.nextInt();
			System.out.println(number1+" / "+number2+" is "+(number1/number2));
		}

		catch(ArithmeticException ex)
		{
			System.out.println("Exception: an integer cannot be divided by zero");
		}
		catch(InputMismatchException ex) {
			System.out.println("integer please.");
		}

		System.out.println("The program continues ...");
	}
}