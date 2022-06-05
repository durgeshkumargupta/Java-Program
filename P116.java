package mypack4;
import java.util.Scanner;
import mypack3.P115;
class P116
{
	public static void main(String ar[])
	{
		int roll;
		String name;
		P115 t=new P115();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name=");
		name=sc.next();
		System.out.println("Enter roll=");
		roll=sc.nextInt();
		t.getinput(name,roll);
		t.show();
	}
}
		