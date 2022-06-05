class Base1
{
	int x=10;
}
class Base2 extends Base1
{
	int x=20;
}
class Base3 extends Base2
{
	int x=30;
}
class P108 extends Base3
{
	int x=40;
	void show(Base1 c1,Base2 c2,Base3 c3)
	{
		System.out.println("x1="+c1.x);
		System.out.println("x1="+c2.x);
		System.out.println("x1="+c3.x);
		System.out.println("x1="+x);
	}
	public static void main(String args[])
	{
		P108 t=new P108();
		t.show(t,t,t);
		
		System.out.println("x1="+new Base1().x);
		System.out.println("x1="+new Base2().x);
		System.out.println("x1="+new Base3().x);
		System.out.println("x1="+new P108().x);
		System.out.println("x1="+t.x);
		
	}
}
