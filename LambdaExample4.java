interface InterfaceClass
{
	void display(int p);
}
class LambdaExample4 //implements InterfaceClass
{
	public static void main(String args[])
	{
		InterfaceClass i=(x)->System.out.println("Value of X="+x);   //lambda Expression
		i.display(1000);
	}
}