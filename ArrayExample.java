import java.util.Scanner;
import java.util.Set;
import java.util.List;
class ArrayExample
{
	public static void main(String args[])
	{
		Duplicate d=new Duplicate();
		d.show();
	}
}
class Duplicate
{
	int i,j,data=0,count=0;
	int arr[]=new int[10];
	void show()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten data=");
		for(i=0;i<=9;i++)
		arr[i]=sc.nextInt();
	   //Duplicate value find
	    for(i=0;i<=9;i++)
		{
			for(j=i+1;j<=9;j++)
			{
				if(arr[i]==arr[j])
				{
					++count;
					data=1;
					if(count==1)
		              System.out.print(arr[j]+" ");
				}
			}
				count=0;
		}
		System.out.println();
		if(data==0)
			System.out.println("No Duplicate data Avalible");
		
	}
}

		