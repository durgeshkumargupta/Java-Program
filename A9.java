import java.util.*;
class A9
{
	public static void main(String[] args)
	{
		int m=1;
		int i;
		System.out.print("Enter number=");
		Scanner v=new Scanner(System.in);
		  i=v.nextInt();
		for(;i>=1;i--)
		{System.out.print(i);	
	System.out.print("*");
	       m=m*i;
		}
		System.out.println("\b="+m);
	}
}