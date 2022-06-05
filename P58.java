class P58
{
	public static void main(String []agrs)
	{
		String s1="Hello Durgesh";
		String s2="Hello Durgesh";
		String s3="hello Durgesh";
		String s4=new String("Hello Durgesh");
	  	System.out.println(s1.equals(s4));
		System.out.println((s1==s2));
		System.out.println(s1==s3);
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s2));
		System.out.println(s1==s4);
	}
}
		