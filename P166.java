/* Check wheter Number is Even and Odd */
import java.util.Scanner;
class P166
{

	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		 int num=sc.nextInt();
		if(num%2==0)
			System.out.println("Even");
	    else
		  System.out.println("odd");
	}
	public static void main(String args[])
	{
		
		P166 obj=new P166();
		obj.display();
	}
}
		
		