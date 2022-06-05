interface InterfaceClass
{
	void show(int a);
}
class LambdaExample3
{
	public static void main(String args[])
	{
		InterfaceClass i=(a)->System.out.println("Value of A="+a);  //lambda Expression
		i.show(44);
	}
}