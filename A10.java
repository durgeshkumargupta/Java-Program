package Durgesh;
import Hello.Package;
public class A10
{
	public static void main(String[] agrs)
	{
		int i,sum=0,x=0,y=1;
		System.out.print(x);
		System.out.print(" ");
		System.out.print(y);
		
		for(i=1;i<=6;i++)
		{
			sum=x+y;
			x=y;
			y=sum;
			System.out.print(" "+sum);
		}
	//	System.out.println("Import value of sum="+m);
	}
	
}