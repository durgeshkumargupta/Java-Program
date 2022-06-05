import java.util.Scanner;
class P101
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String []nm=new String[3];
		int i;
		for(i=0;i<=2;i++)
		{
			System.out.println("Enter name["+(i+1)+"]=");
			nm[i]=sc.nextLine();
		}
		for(i=0;i<=2;i++)
		{
			System.out.println("Your name="+nm[i]);
		}
    }
}
		
		