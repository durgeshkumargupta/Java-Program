class P129
{
	public static void main(String args[])
	{
		System.out.println("Statment 1");
		System.out.println("Statment 2");
		try
		{
			int a=10/0;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	System.out.println("Statment 3");
	}
}