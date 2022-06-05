package pack6;
import java.util.Scanner;
import pack5.P119;
class P120
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		P119 t=new P119();
		System.out.println("Enter Name=");
		String name=sc.next();
		System.out.println("Enter roll=");
		int roll=sc.nextInt();
		t.getinput(name,roll);
		t.show();
	}
}