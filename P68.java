import java.util.Scanner;
class P68
{
	String name;
	int roll;
	void input(int r,String n)
	{
		name=n;
		roll=r;
	}
	void display()
	{
		System.out.println("Roll="+roll);
		System.out.println("Name="+name);
	}
	public static void main(String []ar)
	{
		P68 v=new P68();
		Scanner t=new Scanner(System.in);
		int r;String n;
		System.out.print("Enter Name=");
		n=t.nextLine();
		System.out.print("Enter Roll=");
		r=t.nextInt();
		v.input(r,n);
		v.display();
	}
}