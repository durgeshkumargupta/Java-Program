class P51
{
	int roll;
	String name;
	void getinput(int r,String n)
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
		P51 v=new P51();
		v.getinput(44,"Ramesh");
		v.display();
	}
}
	