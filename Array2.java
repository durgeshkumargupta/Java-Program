import java.util.*;
class Array2
{
	public static void main(String args[])
	{
		int i,arr[]=new int[5];
		Scanner v=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			System.out.print("Enter Number"+i+"=");
			arr[i]=v.nextInt();
		}
		for(i=0;i<5;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}
			
		