import java.util.Scanner;
class P170
{
	void max_min()
	{
		int max,min,i;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter Ten Digit Number=");
		
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		max=min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>=max)
				max=arr[i];
			else if(arr[i]<=min)
			    min=arr[i];
		}
		System.out.println("Maximum Number is="+max);
		System.out.println("Minuum Number is="+min);
			
	}
	public static void main(String args[])
	{
		P170 obj=new P170();
		obj.max_min();
		
		
	}
}