// Example for PPT page No.22
/* ��֤�ǹȲ��롣�ձ���ѧ�ҽǹȾ������о���Ȼ��ʱ������һ��������󣺶�������һ����Ȼ��n��
��nΪż�����������2����nΪ�������������3��Ȼ���ټ�1����˾������޴������
�ܿ��Եõ���Ȼ��1�����ǰѽǹȾ������һ���ֽ������ǹȲ��롱�� */

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