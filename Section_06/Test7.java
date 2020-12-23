// Example for PPT page No.18

public class Test7
{
	public static void main(String[] args)
	{
		String s1=new String("Welcome!");
		String s2="welcome!";
		String s3="welcome !";
		
		// Display the strings
		System.out.println("String s1=new String(\"Welcome!\");");
		System.out.println("String s2=\"welcome!\";");
		System.out.println("String s3=\"welcome !\";");
		System.out.println();
		
		// Apply the different compare methods
		System.out.println("s1.compareTo(s2) is: "+s1.compareTo(s2));
		System.out.println("s1.compareTo(s3) is: "+s1.compareTo(s3));
		System.out.println();
		
		System.out.println("s2.compareTo(s1) is: "+s2.compareTo(s1));
		System.out.println("s2.compareTo(s3) is: "+s2.compareTo(s3));
		System.out.println();

		System.out.println("s1.compareToIgnoreCase(s2) is: "+s1.compareToIgnoreCase(s2));

	}
}