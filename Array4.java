import java.util.*;
class Array4
{
	public static void main(String [] agrs)
	{
		 int x,i,num,sum=0;
		 Scanner v=new Scanner(System.in);
		 System.out.print("Enter Size of array=");
	      x=v.nextInt();
		 int arr[]=new int[x];
		 System.out.print("Enter number=");
		 for(i=0;i<x;i++)
		 {
			 arr[i]=v.nextInt();
			 sum+=arr[i];
		 }
		 System.out.print("Total addition number of array number="+sum);
	}
}

		