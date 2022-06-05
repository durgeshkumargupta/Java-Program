interface I1
{
	
	void show(int roll,String name);
	void show2(int roll,String name);
}
class Example implements I1
{
	public void show(int r,String n){}
	public void show2(int p,String i){}
}
class Anonymous4
{
	public static void main(String args[])
	{
		new Example()
		{
			@Override
			public void show(int roll,String name)
			{
				System.out.println("Name= "+name+" Roll= "+roll);
			}
		}.show(21,"Durgesh");
		
		new Example()
		{
			@Override
			public void show2(int roll,String name)
			{
				System.out.println("Name= "+name+" Roll= "+roll);
			}
		}.show2(55,"Prince");
	}
}