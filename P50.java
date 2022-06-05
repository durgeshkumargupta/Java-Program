/* input three number thought keyboard and find gratest number */
import java.util.*;
class P50
{
	public static void main(String []agrs)
	{
		int a,b,c,d,e;
		
		Scanner v=new Scanner(System.in);
		System.out.println("Enter three number=");
		a=v.nextInt();
		b=v.nextInt();
		c=v.nextInt();
		if(a>b && a>c)
			System.out.println("A is a gratest number");
		else if(b>c)
			System.out.println("B is a gratest number");
		else
			System.out.println("C is a gratest number");
	}
}
