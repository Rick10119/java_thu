// Example for PPT page No.22

import java.util.Scanner;

public class Demo3
{
	public static void main(String[] args)
	{
		// Declare and create the input object
		Scanner input=new Scanner(System.in);

		// Prompt enter an int, a float for write to a String
		System.out.printf("Please input an int and a float: ");
		int i=input.nextInt();
		float f=input.nextFloat();
		
		String str1=String.format("The formatted string is %3d,%3d, %4.2f",i,i*2,f);
		System.out.println(str1);
		
	}
}