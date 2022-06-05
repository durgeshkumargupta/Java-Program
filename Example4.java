class Example4
{
	int roll;
	String name;
	Example4(int roll,String name)
	{
		this.name=name;
		this.roll=roll;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String []agrs)
	{
		Example4 v=new Example4(55,"Manish");
		v.display();
	}
}