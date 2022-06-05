// this keyword using constructor
class P202
{
	public static void main(String args[])
	{
		new This();
		
	}
}
class This
{
	This()
	{
		this(22);
		System.out.println("Default constructor");
	}
	This(int a)
	{
		System.out.println("Parameter constructor");
	}
}