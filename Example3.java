class Example3
{
	int roll;
	String name;
	Example3()
	{
		roll=21;
		name="Durgesh";
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String []agrs)
	{ 
	   Example3 v=new Example3();
	    v.display();
	}
}
	