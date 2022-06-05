class Base
{
	Base show()
	{
		System.out.println("show of base");
		return null;
	}
}
class Child extends Base
{
	Child show()
	{
		System.out.println("Show of child");
		return new Child();
	}
	public static void main(String ras[])
	{
		Base t=new Child();
		t.show();
	}
}
	
	