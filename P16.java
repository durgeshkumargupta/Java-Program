/* Fibonacci Series */
import java.util.*;
class P16
{
	public static void main(String args[])
	{
		int sum=0,i,j,x=0,y=1;
		Scanner v=new Scanner(System.in);
		System.out.print("Enter number and size of Find Fibonacci Series=");
		   j=v.nextInt();
		System.out.print("Fibonacci Series="+x);
		for(i=1;i<j;i++)
		{
			x=y;
			y=sum;
			sum=x+y;
		  System.out.print(" "+sum);
		}
	}
}
			