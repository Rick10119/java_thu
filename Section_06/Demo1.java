// Example for PPT page No.19

import java.util.Scanner;

public class Demo1
{
	public static void main(String[] args)
	{
		// Declare and create input object
		Scanner input=new Scanner(System.in);
		
		// Prompt to enter the string
		System.out.printf("Please input the string: ");
		String str1=input.next();
		
		// Display the string and its length
		int l=str1.length();
		
		System.out.println("The original string is: ("+str1+"), and the length of the string is: "+l);
		System.out.println();
		
		// Prompt to enter the index of the character
		System.out.printf("Please input the index of character: ");
		int i=input.nextInt();
		
		char c=str1.charAt(i);
		
		System.out.println("The no."+i+" character in string ("+str1+") is: "+c);
		System.out.println();
		
		// Prompt to enter a new string and combine the two strings
		System.out.printf("Please enter the new string for combine: ");
		String str2=input.next();
		
		String str3=str1.concat(str2);
		String str4=str1+str2;
		
		System.out.println("The 1st string is: "+str1);
		System.out.println("The 2nd string is: "+str2);
		System.out.println("The str1.concat(str2) is: "+str3);
		System.out.println("And Str1+str2 is:         "+str4);
	}	
}