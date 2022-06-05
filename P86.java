class P86
{
	static
	{
		System.out.println("I'm static block1");
		static //error
		{
			System.out.println("I'm static block2");
		}
		
	}
	static
	{
		System.out.println("I'm static block1");
		{//error
			System.out.println("I'm static block2");
		}
		
	}
	
	public static void main(String agrs[])
	{
	   
	}
}
			
		