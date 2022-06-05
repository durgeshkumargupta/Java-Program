import java.util.*;
public class Armstrong_Number
{
	public static void main(String[] args)
	{
		int num,temp,i,sum=0;
		Scanner v=new Scanner(System.in);
		System.out.print("Enter number=");
		  num=v.nextInt();
		  i=num;
		 for(;i!=0;)
		 {
			 temp=i%10;
			 sum=sum+(temp*temp*temp);
			 i=i/10;
		 }
		 if(sum==num)
		 System.out.println("Armstrong Number");
	     else
		  System.out.println("Not Armstrong Number");
	}
	
}
	  














		