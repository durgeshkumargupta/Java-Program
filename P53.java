class P53
{
	int roll;
	String name;
	P53()
	{
		roll=59;
		name="Shavani";
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String []agrs)
	{
		P53 v=new P53();
		v.display();
	}
}
	