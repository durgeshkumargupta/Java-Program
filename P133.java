class P133
{
	public static void main(String args[])
	{
	
		try
		{
			System.out.println("Statment 1");
			int a=20/0;
			System.out.println("Statment 2");
			int c[]=new int[5];
			c[22]=20;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			
		}
	System.out.println("Statment 3");
	}
}