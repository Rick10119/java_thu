// 字符数组及数学函数应用示例

public class Chart
{
	public static void main(String[] args)
	{
		int width=Integer.parseInt(args[0]);
		int height=Integer.parseInt(args[1]);
		
		// 设立显示图像的字符数组
		char[][] c=new char[height*2+1][width+1];
		
		// 初始化显示坐标系
		init(c);
		
		// 绘制三角函数
		draw(c);
		
		// 显示最后的图像
		display(c);
	}
	
	public static void init(char[][] c)
	{
		// 将空格填入数组元素中
		for(int i=0;i<c.length;i++)
		{	for(int j=0;j<c[i].length;j++)
			{	c[i][j]=' ';
			}
		}
		
		// 设置 X 轴
		int h=c.length/2;
		for(int j=0;j<c[h].length;j++)
		{	c[h][j]='-';
		}
		
		// 设置 Y 轴
		for(int i=0;i<c.length;i++)
		{	c[i][0]='|';
		}
		
		// 设置原点
		c[h][0]='+';
	}

	// 绘制三角函数
	public static void draw(char[][] c)
	{
		// 定位 X 轴
		int h=c.length/2;
		
		// 计算 Y 方向位置
		for(int j=0;j<c[h].length;j++)
		{	double r=Math.toRadians((double)j*360/(double)(c[h].length-1));
			int i=(int)(h-Math.sin(r)*(double)h+0.5);
			c[i][j]='*';
		}
		
	}

	// 显示图像
	public static void display(char[][] c)
	{
		for(int i=0;i<c.length;i++)
		{	for(int j=0;j<c[i].length;j++)
			{	System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}

}