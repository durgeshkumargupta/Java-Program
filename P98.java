import java.util.Scanner;
class P98
{
	int a,b;
	void getinput(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void show()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String args[])
	{
	     P98 v=new P98();
		 System.out.println("Enter two number=");
		 Scanner t=new Scanner(System.in);
		 int a=t.nextInt();
		 int b=t.nextInt();
		 v.show();
		 v.getinput(a,b);
		 v.show();
	
	}
}

