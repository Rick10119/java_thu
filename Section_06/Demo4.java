// Example for PPT page No.22

import java.util.Scanner;

public class Demo4
{
	public static void main(String[] args)
	{
		// Declare and create input object
		Scanner input=new Scanner(System.in);
		
		// Prompt enter a string for reading
		System.out.printf("Please input the string with 1 integer and 2 float: ");
		String str1=input.next();
		String str2=input.next();
		String str3=input.next();
		System.out.println();
		
		System.out.println("Your input is: "+str1+"/"+str2+"/"+str3);
		
		int i=Integer.parseInt(str1);
		float f1=Float.parseFloat(str2);
		float f2=Float.parseFloat(str3);
		
		System.out.println("The integer is: "+i);
		System.out.println("The 1st float is: "+f1);
		System.out.println("The sum of the two floats is: "+(f1+f2));
	}
}

