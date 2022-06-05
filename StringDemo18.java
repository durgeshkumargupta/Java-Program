import java.util.Scanner;
class StringDemo18
{
	public static void main(String rr[])
	{
       Scanner v=new Scanner(System.in);
	   System.out.print("Enter any String=");
	   String str=new String(v.nextLine());
	   int l,i;
	      l=str.length();
		  System.out.print("Reverse of String=");
	   for(i=l-1;i>=0;i--)
		   System.out.print(str.charAt(i));
	}
}
