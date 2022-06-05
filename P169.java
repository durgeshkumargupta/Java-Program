import java.util.Scanner;
class P169
{
	public static void main(String args[])
	{
		int search1=0,search2=0,i;
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Enter Ten Digit Number=");
		
		for(i=0;i<arr.length;i++)
		{
			//System.out.println("Enter Number");
			arr[i]=sc.nextInt();
		
		}
		System.out.println("Enetr Searching Data=");
		search1=sc.nextInt();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==search1)
			{	search2=arr[i];
		    break;
			}
		
			
			
		}
		if(search1==search2)
		   
			System.out.println("Data Found");
		else
			System.out.println("Data Not Found");
	   
			
		
	}
}