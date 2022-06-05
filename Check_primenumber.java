import java.util.*;
public class Check_primenumber
{
	public static void main(String[] args)
	{
		int t,num,temp,i,count=0;
		Scanner n=new Scanner(System.in);
		System.out.print("Enter number=");
		num=n.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Prime number");
		else
	     System.out.println("Not prime number");
	}
}