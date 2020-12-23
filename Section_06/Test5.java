// Example for PPT page No.14

public class Test5
{
	public static void main(String[] args)
	{
		String s1=new String("Hello World!");
		String s2="Hello World!";
		String s3=new String("Hello World!");
		String s4="Hello World!";
		String s5="HELLO WORLD!";

		
		System.out.println("String s1=new String(\"Hello World!\");");
		System.out.println("String s2=\"Hello World!\";");
		System.out.println("String s3=new String(\"Hello World!\");");
		System.out.println("String s4=\"Hello World!\";");
		System.out.println("String s5=\"HELLO WORLD!\";");
		System.out.println();

		System.out.println("If s1 and s2 reference for same string? "+(s1==s2));
		System.out.println("If s1 and s3 reference for same string? "+(s1==s3));
		System.out.println("If s1 and s4 reference for same string? "+(s1==s4));
		System.out.println("If s1 and s5 reference for same string? "+(s1==s5));
		System.out.println();

		System.out.println("If s2 and s3 reference for same string? "+(s2==s3));
		System.out.println("If s2 and s4 reference for same string? "+(s2==s4));
		System.out.println("If s2 and s5 reference for same string? "+(s2==s5));
		System.out.println();

		System.out.println("If s3 and s4 reference for same string? "+(s3==s4));
		System.out.println("If s3 and s5 reference for same string? "+(s3==s5));
		System.out.println();

		System.out.println("If s4 and s5 reference for same string? "+(s4==s5));
	}
}