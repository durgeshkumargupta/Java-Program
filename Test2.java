package college;
class Cal
{
	void sum(int a,int b)
	{
		System.out.println("Sum="+(a+b));
	}
	void per(double r)
	{
		System.out.println("Percentge="+((r*10)/100));
	}
}
class Advcal extends Cal
{
	void sub(int a,int b)
	{
		System.out.println("Substration="+(a-b));
	}
	void per(float r)
	{
		System.out.println("Percentge="+((r*20)/100));
	}
}
	
class Test2
{
	public static void main(String args[])
	{
	  Cal obj=new Cal();
      obj.sum(10,20);
	  Advcal obj1=new Advcal();
	  obj1.sum(10,20);
	  obj1.sub(40,20);
	  obj1.per(100.00f);
	}
}