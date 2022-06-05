class P130
{
	public static void main(String args[])
	{
		System.out.println("Statment 1");
		System.out.println("Statment 2");
		try
		{
			int a=10/0;
		}catch(RuntimeException e)
		{
			System.out.println("Server not found");
		}
	System.out.println("Statment 3");
	}
}