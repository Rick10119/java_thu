/** 九连环拆解程序 */
public class NineRing
{
	static int step=0;
	
	/** 主方法 */
	public static void main(String[] args)
	{
		// 初始化九连环状态，状态1为此环在支架上，状态0为此环已拆离支架；第0个为最前环，第8个为离前端最远的一个环
		int[] ningRing={1, 1, 1, 1, 1, 1, 1, 1, 1};
		
		// 显示九连环初始状态
		pr(ningRing,"Original-",step);
		
		// 调用求解方法
		solve(ningRing);
		
		// 显示九连环最终状态
		pr(ningRing,"Final-",step);
	}
	
	/** 九连环求解方法 */
	public static void solve(int[] r)
	{
		// 按顺序从最后一个解到最前一个
		for(int i=r.length-1; i>=0; i--)
		{
			// 调用对特定环进行特定操作的递归方法，即对第i个环进行操作（0-为拆解操作，1-为安装操作）
			solveRing(r, i, 0);
		}
	}
	
	/** 对特定环进行指定操作的递归方法 */
	// 参数为：a-九连环状态数据，k-指定环位置，id-对指定环的特定操作（0-为拆解操作，1-为安装操作）
	public static void solveRing(int[] a, int k, int id)
	{
		// 检测是否是最先一个（第0个）环
		if(k==0)
		{
			// 直接进行特定操作
			a[k]=id;
		}
		// 不是最先一个环
		else
		{
			// 检测当前环的前一个（k-1）环是否在支架上
			if(a[k-1]==0)
			{
				// 第k-1个环不在支架上，调用递归方法将其安装上
				solveRing(a, k-1, 1);
			}
			
			// 已保证前一个（k-1）环在支架上，依次从后向前将前面所有的环拆解下来
			for(int j=k-2; j>=0; j--)
			{
				// 调用递归方法将第j个环拆解下来
				solveRing(a, j, 0);
			}
			
			// 已满足对第k个环操作的条件，对第k个环进行直接操作
			a[k]=id;
		}
		
		// 记录执行的次数
		step++;

		// 显示当前处理之后的九连环状态
		pr(a, "-step-",step);
	}
	
	/** 显示九连环状态的方法 */
	public static void pr(int[] b, String s,int m)
	{
		// 利用for-each循环依次显示九连环每个环的当前状态，如果利用for循环应该更加清楚
		for(int i: b)
		{
			System.out.printf("%2d",i);
		}
		
		// 显示提示信息
		System.out.println(" <=== "+s+m);
	}
}