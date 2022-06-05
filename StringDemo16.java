import java.util.*;
class StringDemo16
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter any String=");
		String v1=a.nextLine();
		String v2=v1.toLowerCase();
		System.out.println(v2);
		System.out.println(v2.replace(0,'D'));
	//	System.out.println(v2.replace(0,v2.toUpperCase()));
		
	}
}	