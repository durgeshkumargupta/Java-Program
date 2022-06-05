import java.util.Scanner;
class StringDemo17
{
	public static void main(String []arr)
	{
		Scanner v=new Scanner (System.in);
		System.out.print("Enter Any String=");
		String str=v.nextLine();
	//	String str1=str.charAt(0);
	//	System.out.println(str1);
	    str=str.replace(0,(str.charAt(0)).toUpperCase());
		System.out.println(str);
	}
}