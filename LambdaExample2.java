interface InterfaceClass
{
	void show(int a);
}
class LambdaExample2
{
	public static void main(String args[])
	{
		InterfaceClass i=(int a)->System.out.println("Value of A="+a);  //lambda Expression
		i.show(22);
	}
}