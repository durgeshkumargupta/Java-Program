class Sample
{
	void message(){};
}
class LambdaExample12
{
	public static void main(string args[])
	{
		Sample obj=()->System.out.println("I am Sample method");
		obj.message();
	}
}

/*
 you can not use lambda Expression with respect of class only you can use interface class
Error:incompatible types: Sample is not a functional interface
*/
