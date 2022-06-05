//Print table With the help of Lambda Expression
interface InterfaceClass
{
	void table(int x);
}
class LambdaEaxmple5
{
	public static void main(String args[])
	{
		
		
		InterfaceClass i=(a)->System.out.println(2*a);     //lambda Expression
		for(int j=1;j<=10;j++)
		{
		    i.table(j);
		}
	}
}