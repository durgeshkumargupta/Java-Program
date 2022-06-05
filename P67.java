class P67
{
	int roll;
	String name;
	void input(int r,String n)
	{
		roll=r;
		name=n;
	}
	void display()
	{
		System.out.println("Roll="+roll);
		System.out.println("Name="+name);
	}
	public static void main(String []agr)
	{
		P67 v=new P67();
		v.input(10,"Rakesh");
		v.display();
	}
}	
	
		