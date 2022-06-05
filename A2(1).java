import java.util.*;
class A2
{
	public static void main(String[] args)
	{
		int i,sum=0,limit;
		Scanner v=new Scanner(System.in);
		limit=v.nextInt();
		for(i=0;i<=limit;i++)
		{
			 sum=sum+i;
		}
		System.out.print("Total number of addtion="+sum);
	}
}
