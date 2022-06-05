//use this keyword using method
class P201
{
	public static void main(String args[])
	{
		This obj=new This();
		obj.show2();
	}
}
class This
{
	void show()
	{
		System.out.println("I am Show method");
	}
	void show2()
	{
		this.show();
		System.out.println("I am Show 2 Method");
	}
}