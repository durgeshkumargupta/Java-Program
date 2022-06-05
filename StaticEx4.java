package Static;
class StaticEx4
{
	StaticEx4()
	{
		System.out.println("Default constructor");
	}
	void show()
	{
		System.out.println("show function");
	}
	static
	{
		System.out.println("Static block");
	}
	public static void main(String arge[])
	{
		StaticEx4 v=new StaticEx4();
		v.show();
	}
}