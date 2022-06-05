package This;
class ThisEx4
{
	 ThisEx4()
	{
		System.out.println("Default constructor");
	}
	ThisEx4(int r)
	{
		this();
		System.out.println("parametrized constructor");
	}
	
	public static void main(String args[])
	{
		ThisEx4 v=new ThisEx4(12);
	}
}