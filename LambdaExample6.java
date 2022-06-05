//Example of lambda Example table print any number
import java.util.Scanner;
interface InterfaceClass
{
	void table(int b);
}
class LambdaExample6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number and Find the table=");
		int p=sc.nextInt();
		InterfaceClass i=(a)->System.out.println(p*a);   //lambda Expression
		System.out.println("Table of "+p);
		for(int j=1;j<=10;j++)
		{
			i.table(j);
		}
	}
}
	