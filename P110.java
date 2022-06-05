class Base10
{
	int x=10;
}
class Base20 extends Base10
{
	int x=20;
	void show()
	{
	System.out.println(((Base10)this).x);
	}
}
class P110 extends Base20
{
	int x=30;
	public static void main(String ars[])
	{
		Base20 v=new Base20();
		v.show();
	
	//System.out.println(((Base10)this).x);	
		System.out.println("x2="+new Base20().x);
	//	System.out.println("x3="+());
	}
}
