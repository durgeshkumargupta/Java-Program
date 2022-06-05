/* Find Neon Number */
import java.util.Scanner;
class Neon_Number
{
	public static void main(String agars[])
	{
		int rem,sq,sum=0,num,i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number=");
		num=sc.nextInt();
		sq=num*num;
		for(i=sq;i!=0;i/=10)
		{
			rem=i%10;
			sum=sum+rem;
		}
		if(sum==num)
			System.out.print("Neon Number");
		else
			System.out.print("Not Neon Number");
	}
}

		