// Example for PPT page No.5

public class Test1
{
	public static void main(String[] args)
	{
		System.out.println("Degree   sin(x)   cos(x)   tan(x)");

		for(int i=0;i<=360;i+=30)
		{
			double r=Math.toRadians(i);
			System.out.printf("%4d    %6.3f   %6.3f   %6.3f\n",i,Math.sin(r),Math.cos(r),Math.tan(r));
		}
	}
}