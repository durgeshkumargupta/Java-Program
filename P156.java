class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class A="+i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Class B="+i);
		}
	}
}
class P156
{
//	A t1=new A();
//	B t2=new B();
	Thread obj1=new Thread(new A());
    Thread obj2=new Thread(new B());
    obj1.start();
	obj2.start();
}