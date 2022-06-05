import java.util.Scanner;
class TernaryExample1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number=");
		int num=sc.nextInt();
		(num%2==0)?System.out.println("Even"):System.out.println("Odd");
	}
}
		
		