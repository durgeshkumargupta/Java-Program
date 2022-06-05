import java.util.Scanner;
class StringDemo21
{
	public static void main(String []args)
	{
		String p1="";
		Scanner v=new Scanner(System.in);
		System.out.print("Enter any String and check String is palidrom or not=");
	    String p=v.nextLine();
		int l=p.length();
        for(int i=(l-1);i>=0;i--)
		{
			p1=p1+p.charAt(i);
		}
		System.out.println(p1);
        if(p1.equals(p))
            System.out.println("String is palindrom");
        else
           System.out.println("String is not palidrom");
	}
}	