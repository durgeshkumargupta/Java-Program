/* trim():-  */
import java.util.*;
class StringDemo11
{
	public static void main(String []arr)
	{
		Scanner y=new Scanner(System.in);
		System.out.print("Enter any String=");
		String a=y.nextLine();
		String b=a.trim();
	    System.out.println("Length of A="+a.length());
		System.out.println("length of B="+b.length());
    }
}	