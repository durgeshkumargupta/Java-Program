import java.util.Scanner;
class P70
{
	String name;
	int roll;
	P70(int r,String n)
	{
		name=n;
		roll=r;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String []arr)
	{
		Scanner v=new Scanner(System.in);
		int r;
		String n;
		System.out.print("Enter Name=");
		n=v.nextLine();
		System.out.print("Enter Roll=");
		r=v.nextInt();
		P70 p=new P70(r,n);
		p.display();
	}
}