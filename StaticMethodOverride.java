class A
{
	public void m1()
	{
		System.out.println("M1 non-method of class A");
	}
	public static void m2()
	{
		System.out.println("M2 static method of class A");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("M1 non-method of class B");
	}
	public static void m2()
	{
		System.out.println("M2 static method of class B");
	}
}
class StaticMethodOverride
{
	public static void main(String args[])
	{
		B b=new B();
		b.m1();
		b.m2();
		A b1=new B();
		b1.m1();
		b1.m2();
	}
}