class P55
{
	int roll;
	String name;
	 P55(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String []agrs)
	{
		P55 v=new P55(21,"Durgesh");
		v.display();
	}
}