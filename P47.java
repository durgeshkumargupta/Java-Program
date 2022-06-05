class Hello
{
	protected int roll;
	String name;
	void input()
	{
		roll=22;
		name="Adity";
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
}
class P47
{
	public static void main(String []agrs)
	{
		Hello v=new Hello();
	//	v.input();
		v.display();
		
	}
}
