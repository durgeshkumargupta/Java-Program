class P54
{
	P54()
	{
		System.out.println("defalut constructor");
	}
	P54(int r)
	{
		System.out.println("parameterize constructor");
	}
	public static void main(String []agrs)
	{
		P54 v=new P54();
		P54 p=new P54(11);
	}
}
	