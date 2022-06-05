import java.util.*;
class StringDemo13
{
	public static void main(String []agg)
	{
		Scanner v=new Scanner(System.in);
		System.out.println("Enetr any String=");
		StringBuffer a=new StringBuffer(v.nextLine());
		System.out.println("A="+a);
		a="Hello"+a;
		System.out.println("New A="+a);
		
	}
}