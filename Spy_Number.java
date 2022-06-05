/* Find Spy Number */
import java.util.Scanner;
class Spy_Number
{
	public static void main(String []aa)
	{
		int num,rem,multi=1,sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number=");
		num=sc.nextInt();
		for(i=num;i!=0;i/=10)
		{
			rem=i%10;
			multi=multi*rem;
			sum=sum+rem;
		}
		if(multi==sum)
			System.out.print("Spy Number");
		else
			System.out.print("Not spy number");
	}
}
		