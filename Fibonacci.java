public class Fibonacci
{
	public static void main(String[] args)
	{
		int i,y=1,x=0,sum=0;
		System.out.print(x+" ");
		for(i=0;i<=8;i++)
		{
			 x=y;
			 y=sum;
			 sum=x+y;
			 System.out.print(sum+" ");
		}
	}
} 