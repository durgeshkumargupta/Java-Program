/* Example of both function equals() and equalsIgnoreCase() */
import java.util.Scanner;
class StringDemo9
{
	public static void main(String []ahrs)
	{
		Scanner y=new Scanner(System.in);
		System.out.println("Enter first String=");
		String a=y.nextLine();
		System.out.println("Enter Second String=");
		String b=y.nextLine();
		
		if(a.equals(b))
			System.out.println("Content are same");
		else
			System.out.println("Content are Not same");
		
		if(a.equalsIgnoreCase(b))
			System.out.println("Content are same");
		else
			System.out.println("Content are not same");
	}
}