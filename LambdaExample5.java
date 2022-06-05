//Print table With the help of Lambda Expression
interface InterfaceClass
{
	void Table(int x);
}
class LambdaEaxmple5
{
	public static void main(String args[])
	{
		
		InterfaceClass i=(a)->System.out.println(2*a);
	//	for(int j=2;j<=10;j++)
	//	{
		    i.Table(2);
	//	}
	}
}