class P89
{
	int roll;
	String name;
	void show()
	{
		System.out.println(name);
		System.out.println(roll);
	}
	P89(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	P89()
	{
	}
	public static void main(String args[])
	{
		P89 v1=new P89(21,"Durgesh");
		v1.show();
		P89 v2=new P89();
		v2.show();
		v2.name=v1.name;
		v2.roll=v1.roll;
		v2.show();
	
	}
}
		