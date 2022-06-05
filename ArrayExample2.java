import java.util.Scanner;
class ArrayExample2
{
	public static void main(String args[])
	{
		Duplicate d=new Duplicate();
		d.show();
	}
}
class Duplicate
{
	int i,j,count=0,size;
	int arr[]=new int[55];
	int dup[]=new int[55];
	void show()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size=");
		size=sc.nextInt();
		System.out.println("Enter Array element=");
		for(i=0;i<size;i++)
		{
		arr[i]=sc.nextInt();
		dup[i]=-1;
		}
	   //Duplicate value find
	    for(i=0;i<size;i++)
		{
			count=1;
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					dup[j]=0;
				}
			}
				if(dup[i]!=0)
					dup[i]=count;
		}
		System.out.println("Duplicate Data=");
		for(i=0;i<size;i++)
			if(dup[i]>1)
				System.out.print(arr[i]+" ");
		
	}
}

		