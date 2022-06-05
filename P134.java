class P134
{
	public static void main(String args[])
	{
	
		try
		{
			System.out.println("Statment 1");
			
			int c[]=new int[5];
			c[22]=20;
			int a=20/0;
			System.out.println("Statment 2");
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
	System.out.println("Statment 3");
	}
}