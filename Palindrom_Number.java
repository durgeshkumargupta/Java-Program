import java.util.*;
public class Palindrom_Number
{
	public static void main(String[] args)
	{
		int i,temp,num,sum=0;
		Scanner v=new Scanner(System.in);
		System.out.print("Enter number=");
		num=v.nextInt();
		
		for(i=num;i!=0;i/=10)
		{
			temp=i%10;
			sum=sum*10+temp;
		}
		if(sum==num)
		System.out.println("Palindrom number");
		else
		System.out.println("Not palindrom number");
	}
}