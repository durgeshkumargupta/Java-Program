/* equals():- */
import java.util.Scanner;
class StringDemo7
{
	public static void main(String []agr)
	{
		Scanner t=new Scanner(System.in);
	    System.out.println("Enter first Any String=");
		String a=t.nextLine();
		System.out.println("Enter Second String=");
		String b=t.nextLine();
		if(a.equals(b))
			System.out.println("Content are same");
		else 
			System.out.println("Content are not same");
    }
}	