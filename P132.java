class P132
{
	public static void main(String args[])
	{
		System.out.println("Statment 1");
		System.out.println("Statment 2");
		try
		{
			int a[]=new int[5];
			a[22]=20;
		}catch(Throwable e)
		{
			System.out.println(e);
			System.out.println("Server not found");
		}
	System.out.println("Statment 3");
	}
}