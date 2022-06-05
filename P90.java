class P90
{
	int roll;
	String name;
	void show()
	{
		System.out.println(name);
		System.out.println(roll);
	}
	P90(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	P90(P90 t)
	{
		name=t.name;
		roll=t.roll;
		
	}
	public static void main(String args[])
	{
		P90 v1=new P90(21,"Durgesh");
		v1.show();
		P90 v2=new P90(v1);
		v2.show();
	
	}
}
		