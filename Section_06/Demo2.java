// Example for PPT page No.20

import java.util.Scanner;

public class Demo2
{
	public static void main(String[] args)
	{
		// Declare and create the input object
		Scanner input=new Scanner(System.in);
		
		String message="Welcome to Java";
		String message1=message.substring(0,11)+"HTML";
		
		System.out.println("The original string is: "+message);
		System.out.println("The new string is:      "+message1);
		System.out.println();
		
		// Prompt to enter an new string
		System.out.printf("Please input an new string: ");
		String str=input.next();
		
		// Prompt to enter the beingIndex and the endIndex
		System.out.printf("Please input the begin and end index of the substring: ");
		int begin=input.nextInt();
		int end=input.nextInt();
		System.out.println();
		
		// Get and display the substring
		String sub1=str.substring(begin);
		String sub2=str.substring(begin,end);
		
		System.out.println("substring("+begin+") is: "+sub1);
		System.out.println("substring("+begin+","+end+") is: "+sub2);
	}
}