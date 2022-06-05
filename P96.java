import java.util.Scanner;
class P96
{
    int a,b;
	public static void main(String args[])
	{
		P96 v=new P96();
		Scanner t=new Scanner(System.in);
		System.out.println("Enter two number");
		v.a=t.nextInt();
		v.b=t.nextInt();
		int c;
		c=v.a+v.b;
		System.out.println("Sum="+c);
    }
}