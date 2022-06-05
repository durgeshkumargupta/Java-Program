import java.util.Scanner;
class P72
{
	public static void main(String []ee)
	{
		Scanner v=new Scanner(System.in);
		System.out.println("Enter any String=");
		StringBuffer t=new StringBuffer(v.nextLine());
		System.out.println(t);
		System.out.println(t.charAt(5));
		System.out.println(t);
		t.setCharAt(5,'A');
		System.out.println(t);
		System.out.println(t.charAt(5));
	}
}
		
		
		