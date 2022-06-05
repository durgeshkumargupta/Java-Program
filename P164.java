import java.util.Scanner;
class P164
{
	int a;
	P164(int a)
	{
		if(a%2==0)
			System.out.println("Even");
	    else
		  System.out.println("odd");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number=");
		int a=sc.nextInt();
		new P164(a);
	}
}
		
		