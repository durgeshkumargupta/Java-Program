class StringDemo2
{
	public static void main(String []agrs)
	{
		String a="Hello";
		String b="hello";
		String c=new String("Hello");
		String d=new String("Hello");
		if(a==b)
			System.out.println("Same reference");
		else
			System.out.println("Not Same reference");	
		if(a==c)
			System.out.println("Same reference");
		else
			System.out.println("Not Same reference");
		if(c==d)
			System.out.println("Same reference");
		else
			System.out.println("Not Same reference");
	}
}
			