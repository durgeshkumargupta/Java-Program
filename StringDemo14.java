import java.util.*;
class StringDemo14
{
	public static void main(String []aa)
	{
		Scanner v=new Scanner(System.in);
		System.out.println("Enter any String=");
		String a=new String(v.nextLine());
		System.out.println("A="+a);
		a="Hello"+a;
		System.out.println("New A="+a);
	}
}