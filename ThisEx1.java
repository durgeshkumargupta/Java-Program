package This;
class ThisEx1
{
	void m()
	{
		System.out.println("I am m method");
	}
	void n()
	{
		this.m();
		System.out.println("I am N method");
	}
	public static void main(String ars[])
	{
		ThisEx1 v=new ThisEx1();
		v.n();
	}
}