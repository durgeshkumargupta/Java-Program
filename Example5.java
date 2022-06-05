class A
{
	int a;
	A()
	{
		System.out.println("constuctor");
	}
   void	display1()
	{
		System.out.println("class A="+a);
	}
}
class B extends A
{
	int a;
	void input(int a)
	{
	//	super(55);
		this.a=a;
	}
	void display2()
	{
		System.out.println("class B="+a);
	}
}
class Example5
{
	public static void main(String []agrs)
	{
		A v=new A();
		B t=new B();
		t.input(20);
		t.display2();
		v.display1();
  	}
}
	