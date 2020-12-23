// Example for PPT page No.6

import java.util.Scanner;

public class Test2
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please input a number in float format :");
		float f=input.nextFloat();
		
		System.out.print("Please input a number in double format:");
		double d=input.nextDouble();
		
		System.out.printf("Math.....  %6.3f  %10.7f\n",f,d);
		System.out.printf("ceil (x)=  %6.3f  %10.7f\n",Math.ceil(f),Math.ceil(d));
		System.out.printf("floor(x)=  %6.3f  %10.7f\n",Math.floor(f),Math.floor(d));
		System.out.printf("rint (x)=  %6.3f  %10.7f\n",Math.rint(f),Math.rint(d));
		System.out.printf("round(x)=  %6d  %10d\n",Math.round(f),Math.round(d));
	}
}