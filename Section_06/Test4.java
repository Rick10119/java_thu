// Example for PPT page No.13

public class Test4
{
	public static void main(String[] args)
	{
		String message=new String("Hello World!");
		char[] charArray={'H','e','l','l','o',' ','W','o','r','l','d','!'};
		char[] charArray2={'H','e','l','l','o',' ','W','o','r','l','d','!','p'};

		charArray[0]='A';
		
		System.out.println(message);
		System.out.println(charArray);
		
		System.out.println(message.length());
		System.out.println(charArray.length);

		charArray = charArray2;
		System.out.println(charArray.length);

	}
}