class P88
{
	int roll;
	String name;
	void show()
	{
		System.out.println(name);
		System.out.println(roll);
	}
	P88(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	P88()
	{
	}
	public static void main(String args[])
	{
		P88 v1=new P88(21,"Durgesh");
		v1.show();
		P88 v2=new P88();
		v2.show();
		v2=v1;
		v2.show();
	
	}
}
		