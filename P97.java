import java.util.Scanner;
class P97
{
	int a,b,sum;
	
	void sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Sum="+(a+b));
	}
	
	public static void main(String arsg[])
	{
		Scanner sc=new Scanner(System.in);
		P97 t=new P97();
		int a,b;
		System.out.println("Enter two number=");
		a=sc.nextInt();
		b=sc.nextInt();
		t.sum(a,b);
	}
}
