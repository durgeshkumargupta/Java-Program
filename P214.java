class A
{
	void show()
	{
		System.out.println("I am show method of class A");
	}
}
class B extends A
{
	void show()
	{
		super.show();
		System.out.println("I am show method of class B");
	}

	
}
class P214
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}
