//this keyword in constructor
class P203
{
	public static void main(String args[])
	{
		new This(22);
	}
}
class This 
{
	This()
	{
		
		System.out.println("Default constructor");
	}
	This(int a)
	{
		this();
		System.out.println("Parameter constructor");
	}
}
	