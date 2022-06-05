//N Number of larger numner
import java.util.Scanner;
class Larger
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		int i,larger;
		System.out.println("Enter five Number=");
		for(i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		larger=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>larger)
				larger=arr[i];
		}
		System.out.println("larger Number="+larger);
	}
}
		
		
	