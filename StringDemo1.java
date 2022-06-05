class StringDemo1
{
	public static void main(String []agrs)
	{
		String a="Hello";
		String b="Hello";
		String c=new String("Hello");
		
		if(a==b)
			System.out.println("Same reference");
		if(a==c)
			System.out.println("Same reference");
		else
			System.out.println("Not Same reference");
	}
}
			