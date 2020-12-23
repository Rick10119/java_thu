// Example for PPT page No.26 Calculator

public class Demo5 // Calculator in PPT file
{
	public static void main(String[] args)
	{
		// Display args
		for(int i=0;i<args.length;i++)
		{
			System.out.println("args["+i+"] is: "+args[i]);
		}
		System.out.println();
		
		// Read the integers and operator
		int i1=Integer.parseInt(args[0]);
		int i2=Integer.parseInt(args[2]);
		
		char op=args[1].charAt(0);
		
		// Calculate the formula
		int k=0;
		switch (op)
		{
			case '+': k=i1+i2; break;
			case '-': k=i1-i2; break;
			case 'x': k=i1*i2; break;
			case '/': k=i1/i2; break;
			default: System.out.println("Wrong operator!");
		}
		
		// Display the result
		for(int i=0;i<args.length;i++)
		{
			System.out.printf(args[i]+" ");
		}
		
		System.out.println("= "+k);
	}
}