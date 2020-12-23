// Example for PPT page No.22
/* 验证角谷猜想。日本数学家角谷静夫在研究自然数时发现了一个奇怪现象：对于任意一个自然数n，
若n为偶数，则将其除以2；若n为奇数，则将其乘以3，然后再加1。如此经过有限次运算后，
总可以得到自然数1。人们把角谷静夫的这一发现叫做“角谷猜想”。 */

public class Demo5
{
	public static void main(String[] args)
	{
		// Read the number n from command line
		int n=Integer.parseInt(args[0]);
		
		iteration(n);
	}
	
	// Iterate the number of number
	public static void iteration(int k)
	{
		System.out.printf("%d  ",k);
		if(k==1)
		{
			return;
		}
		else if(k%2==0)
		{
			k=k/2;
		}
		else
		{
			k=k*3+1;
		}
		
		iteration(k);
	}
}