class P135
{
	public static void main(String args[])
	{
		System.out.println("Statement 1");
		try
		{
			int a=20/0;
			System.out.println("Statement 2");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Statement 3");
		}
		System.out.println("Statement 4");
	}
}