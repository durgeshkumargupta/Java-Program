/* Find prime number limit Number through keyboard */
import java.util.*;
class P23
{
	public static void main(String args[])
	{
		int limit,i,j,count=0;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter Number and find prime Number limit number=");
		limit=x.nextInt();
		for(i=1;i<=limit;i++)
		{ count=0;
			for(j=1;j<=i/2;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==1)
			System.out.print(i+" ");
	    }
	}
}