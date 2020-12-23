// �ַ����鼰��ѧ����Ӧ��ʾ��

public class Chart
{
	public static void main(String[] args)
	{
		int width=Integer.parseInt(args[0]);
		int height=Integer.parseInt(args[1]);
		
		// ������ʾͼ����ַ�����
		char[][] c=new char[height*2+1][width+1];
		
		// ��ʼ����ʾ����ϵ
		init(c);
		
		// �������Ǻ���
		draw(c);
		
		// ��ʾ����ͼ��
		display(c);
	}
	
	public static void init(char[][] c)
	{
		// ���ո���������Ԫ����
		for(int i=0;i<c.length;i++)
		{	for(int j=0;j<c[i].length;j++)
			{	c[i][j]=' ';
			}
		}
		
		// ���� X ��
		int h=c.length/2;
		for(int j=0;j<c[h].length;j++)
		{	c[h][j]='-';
		}
		
		// ���� Y ��
		for(int i=0;i<c.length;i++)
		{	c[i][0]='|';
		}
		
		// ����ԭ��
		c[h][0]='+';
	}

	// �������Ǻ���
	public static void draw(char[][] c)
	{
		// ��λ X ��
		int h=c.length/2;
		
		// ���� Y ����λ��
		for(int j=0;j<c[h].length;j++)
		{	double r=Math.toRadians((double)j*360/(double)(c[h].length-1));
			int i=(int)(h-Math.sin(r)*(double)h+0.5);
			c[i][j]='*';
		}
		
	}

	// ��ʾͼ��
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