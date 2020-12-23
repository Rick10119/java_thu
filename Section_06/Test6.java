//Example for PPT page No.17

public class Test6
{
	public static void main(String[] args)
	{
		String s1=new String("Welcome");
		String s2="Welcome";
		String s3="WELCOME";
		
		// Display the strings
		System.out.println("String s1=new String(\"Welcome\");");
		System.out.println("String s2=\"Welcome\";");
		System.out.println("String s3=\"WELCOME\";");
		System.out.println();
		
		// Apply different compare methods
		System.out.println("s1.equals(s2) is: "+s1.equals(s2));
		System.out.println("s1==s2 is: "+(s1==s2));
		System.out.println("s1.equals(s3) is: "+s1.equals(s3));
		System.out.println("s1.equalsIgnorCase(s3) is: "+s1.equalsIgnoreCase(s3));
	}
}