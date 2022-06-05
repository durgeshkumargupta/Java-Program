import java.util.*;

class Add2
{
	public static void main(String[] args)
	{
		int i,sum,limit;
		sum=0;
		Scanner v=new Scanner(System.in);
		System.out.println("Enter data=");
		limit=v.nextInt();
		for(i=1;i<=limit;i++)
		{
			 sum=sum+Integer.parseInt(args[i]);
		}
		System.out.print("Total number of addtion="+sum);
	}
}
