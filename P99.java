import java.util.Scanner;
class P99
{
	int a,b,sum;
	P99(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
	void sum(){
	System.out.println("sum="+(a+b));
	}
	public static void main(String rag[])
	{
		Scanner t=new Scanner(System.in);
	    System.out.println("Enter two number=");
		int a,b;
		a=t.nextInt();
		b=t.nextInt();
		P99 i=new P99(a,b);
		i.show();
		i.sum();
	}
}