import java.util.Scanner;
class P171
{
	public static void main(String args[])
	{
		String nm[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Five name=");
		int i;
		for(i=0;i<nm.length;i++)
		{
			nm[i]=sc.nextLine();
		}
		System.out.println("All A start alphbet start=");
		for(i=0;i<nm.length;i++)
		{
			if(nm[i].startsWith("a") || nm[i].startsWith("A"))
				System.out.println(nm[i]);
		}
	}
}