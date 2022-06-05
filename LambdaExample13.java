import java.util.Scanner;
interface Sample
{
	void Operation(int a);
}
class LambdaExample13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number and find the table=");
		int i=sc.nextInt();
		Sample obj=x->System.out.println(x*i);
		System.out.println("Table="+i);
		for(int j=1;j<=10;j++)
			obj.Operation(j);
		
		
	}
}