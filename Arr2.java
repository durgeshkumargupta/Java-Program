package Array;
import java.util.*;
class Arr2
{
	public static void main(String args[])
	{
		int i,arr[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 number=");
		for(i=0;i<=4;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
		