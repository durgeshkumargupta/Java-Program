public class P183
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.show();
	}
}
class Demo
{
	static int a=11;
	void show()
	{
		int a=22;
		System.out.println(Demo.a);
	}
}

//	o/p:11