/* Check wheter Number is Even and Odd */
import java.util.Scanner;
class P167
{

	void display(int num)
	{
		
		if(num%2==0)
			System.out.println("Even");
	    else
		  System.out.println("odd");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		 int num=sc.nextInt();
		
		P167 obj=new P167();
		obj.display(num);
	}
}
		
		