// Example for PPT No.18

public class Test
{
	static int steps=0;
	
	public static void main(String[] args)
	{
		// Define the nine ring with all linked (1)
		int[] nineRing={1,1,1,1,1,1,1,1,1};
		
		// solve the ring
		solve(nineRing);
	}
	
	// The method for solve the ring
	public static void solve(int[] a)
	{
		// Move down the ring from 8 to 0
		for(int i=a.length-1;i>=0;i--)
		{
			solveTheRing(a, i, 0);
		}
	}
	
	// Move the ring up or down, id=1 means on, id=0 means off
	public static void solveTheRing(int[] a, int k, int id)
	{
		if(k==0)
		{
			switch(id)
			{
				case 0: a[k]=0; break;
				case 1: a[k]=1; break;
			}
		}
		else
		{
			// Check status of ring k-1, it should be UP when you want to change the status of ring k
			if(a[k-1]==0) solveTheRing(a, k-1, 1);
			
			// Check status of ring k-2 to 0, they should be down when you change the status of ring k
			for(int i=k-2;i>=0;i--)
			{
				if(a[i]==1) solveTheRing(a, i, 0);
			}
			
			// All rings before are setup, you can change the ring k
			switch(id)
			{
				case 0: a[k]=0; break;
				case 1: a[k]=1; break;
			}
		}

		steps++;
		pr(a);
	}
	
	// The printout method
	public static void pr(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%2d",a[i]);
		}
		System.out.printf(" <=== Step: %3d\n",steps);
	}
}