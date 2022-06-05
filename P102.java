import java.util.Scanner;
class P102
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int roll[]=new int[3];
		String nm[]=new String[3];
		int i;
		for(i=0;i<3;i++)
		{
			System.out.println("Enter Name=");
			nm[i]=sc.next();
			System.out.println("Enter Roll=");
			roll[i]=sc.nextInt();
		}
        System.out.println("Name \t Roll");		
		for(i=0;i<3;i++)
		{ 
         //  System.out.println("Record of["+(i+1)+"]=");
           System.out.println(nm[i]+"  "+roll[i]);		   
		}
	}
}
