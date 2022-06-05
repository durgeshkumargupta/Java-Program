import java.util.Scanner;
class StringDemo19
{
	public static void main(String []arrgs)
	{
		String str1="";
		int l,i;
		Scanner v=new Scanner(System.in);
		System.out.print("Enter Any String=");
		String str=v.nextLine();
	    l=str.length();
		for(i=l;i>=0;i--)
		{
		   str1=str1+str.charAt(i);
		}
		System.out.println("Reverse of string="+str1);
	}
}