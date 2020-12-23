// Example for PPT No.20

public class SquareRoot
{
	public static void main(String[] args)
	{
		// Define the number for square root
		double a=Double.parseDouble(args[0]);
		double limit=Double.parseDouble(args[1]);
		
		// Set the initial X
		double x=a/2;
		
		System.out.printf("The square root of %f is: %f\n",a,calculate(a,x,limit));
		
		System.out.printf("The Math.sqrt(%f) is: %f\n",a, Math.sqrt(a));
	}
	
	public static double calculate(double a, double xn, double limit)
	{
		double xn1=(xn+a/xn)/2;
		
		if(Math.abs(xn1-xn)>limit)
		{
			xn1=calculate(a,xn1,limit);
		}

		return xn1;
	}
}