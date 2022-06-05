import java.util.Scanner;
class P165
{

	void display(int num)
	{
		int rev,count,sum=0;
		for(int i=num;i!=0;i/=10)
		{
			rev=i%10;
			sum=sum+(rev*rev*rev);
		}
		if(num==sum)
			System.out.println("Armstrong number");
	    else
			System.out.println("Not Armstrong number");
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number=");
		int num=sc.nextInt();
		P165 obj=new P165();
		obj.display(num);
	}
}