import java.util.*;
class StringDemo6
{
	public static void main(String[] agr)
	{
		Scanner v=new Scanner(System.in);
		System.out.println("Enter First String=");
		String a=v.nextLine();
		System.out.println("Enter Second string=");
		String b=v.nextLine();
		String c=a.toLowerCase();
		String d=b.toUpperCase();
		System.out.println("Upper case="+d);
		System.out.println("Lower case="+c);
	}
}
	