public class P190
{
	public static void main(String args[])
	{
		Demo.show();
	}
}
class Demo 
{
	static int a=22;
	static void show()
	{
		int a=33;
		System.out.println(a);
	}
}

/* 	O/P:Error Class names, 'P190', are only accepted if annotation processing is explicitly requested
1 error

*/