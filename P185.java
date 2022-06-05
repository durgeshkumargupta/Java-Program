public class P185
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.show();
	}
}
class Demo
{
	
	void show()
	{
		int a=22;
		{
			int a=33;
		    System.out.println(a);
		}
		 System.out.println(a);
	}
}

//	o/p:error alredy define a varible