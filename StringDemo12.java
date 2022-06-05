import java.util.*;
class StringDemo12
{
	public static void main(String []rr)
	{
		Scanner t=new Scanner(System.in);
		System.out.print("Enter any String=");
		StringBuffer a=new StringBuffer(t.nextLine());
		System.out.println("capacity="+a.capacity());
		System.out.println("Length="+a.length());
		
		StringBuffer i=new StringBuffer(t.nextLine());
		System.out.println("Capacity of I="+i.capacity());
		System.out.println("Length="+i.length());
		
		StringBuffer d=new StringBuffer(100);
		System.out.println("Capacity of I="+d.capacity());
		System.out.println("Length="+d.length());
		
		StringBuffer y=new StringBuffer("Hello"+"Durgesh");
		System.out.println(y);	
		
		StringBuffer n=new StringBuffer(("a".concat("i")));
		System.out.println(n);
		
		
		
	}
}
