// Example for PPT page No.9

public class Test3
{
	public static void main(String[] args)
	{
		char c1='a';
		char c2='B';
		char n1='1';
		char n2='2';
		char s1='%';
		char s2='\n';
		
		// Apply isDigit method
		System.out.println("Testing the char ("+c1+") is digit :"+Character.isDigit(c1));
		System.out.println("Testing the char ("+n1+") is digit :"+Character.isDigit(n1));
		System.out.println();
		
		// Apply isLetter method
		System.out.println("Testing the char ("+c2+") is letter :"+Character.isLetter(c2));
		System.out.println("Testing the char ("+n2+") is letter :"+Character.isLetter(n2));
		System.out.println();
		
		// Apply isLetterOrDigit
		System.out.println("Testing the char ("+c1+") is letter or digit :"+Character.isLetterOrDigit(c1));
		System.out.println("Testing the char ("+s1+") is letter or digit :"+Character.isLetterOrDigit(s1));
		System.out.println();
		
		// Apply isLowerCase method
		System.out.println("Testing the char ("+c1+") is lower letter :"+Character.isLowerCase(c1));
		System.out.println("Testing the char ("+c2+") is lower letter :"+Character.isLowerCase(c2));
		System.out.println("Testing the char ("+s1+") is lower letter :"+Character.isLowerCase(s1));
		System.out.println();
		
		// Apply isUpperCase method
		System.out.println("Testing the char ("+c1+") is upper letter :"+Character.isUpperCase(c1));
		System.out.println("Testing the char ("+c2+") is upper letter :"+Character.isUpperCase(c2));
		System.out.println("Testing the char ("+n2+") is upper letter :"+Character.isUpperCase(n2));
		System.out.println();
		
		// Apply toLowerCase method
		System.out.println("The lower case of char ("+c1+") is : "+Character.toLowerCase(c1));
		System.out.println("The lower case of char ("+c2+") is : "+Character.toLowerCase(c2));
		System.out.println("The lower case of char ("+s1+") is : "+Character.toLowerCase(s1));
		System.out.println();
		
		// Apply toUpperCase method
		System.out.println("The upper case of char ("+c1+") is : "+Character.toUpperCase(c1));
		System.out.println("The upper case of char ("+c2+") is : "+Character.toUpperCase(c2));
		System.out.println("The upper case of char ("+n1+") is : "+Character.toUpperCase(n1));
		
	}
}