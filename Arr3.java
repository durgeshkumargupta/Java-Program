package Array;
import java.util.Scanner;
class Arr3
{
	public static void main(String args[])
	{
		Scanner v=new Scanner(System.in);
		System.out.println("you want enter array data=");
		int num=v.nextInt();
		int i,arr[]=new int[num];
		System.out.println("Enter Array data=");
		for(i=0;i<num;i++)
		{
			arr[i]=v.nextInt();
		}
		for(i=0;i<num;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
			
		
			