/* equalIgnoreCase():- */
import java.util.*;
class StringDemo8
{
	public static void main(String []arr)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter first String=");
		String a=t.nextLine();
		System.out.println("Enter Second String=");
		String b=t.nextLine();
		if(a.equalsIgnoreCase(b))
      		System.out.println("Content are Same");
		else
			System.out.println("Content are not Same");
	}
}
		