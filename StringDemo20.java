import java.util.Scanner;
class StringDemo20
{
	public static void main(String []aa)
	{
		Scanner v=new Scanner(System.in);
		System.out.print("Enter any String=");
		String p=new String(v.nextLine());
		System.out.print("Enter Second String=");
		String p1=new String(v.nextLine());
		if(p.equals(p1))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
		if(p.equalsIgnoreCase(p1))
			System.out.println("Both are equal");
		else
			System.out.println("Both are not equal");
	}
}