class P52
{
	int roll;
	String name;
	void getinput(int roll,String name)
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
		P52 v=new P52();
		v.getinput(55,"Manish Bhunda");
		v.display();
	}
}
		