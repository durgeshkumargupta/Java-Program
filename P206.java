class Static
{
	int roll;
	String name;
	String college;
	void getInput(int roll,String name,String college)
	{
		this.college=college;
		this.name=name;
		this.roll=roll;
	}
	void show()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
		System.out.println("College="+college);
	}
}
class P206
{
	public static void main(String args[])
	{
		Static obj1=new Static();
		obj1.getInput(21,"Prince","MGM College");
		obj1.show();
		Static obj2=new Static();
		obj2.getInput(26,"Sonu","MGM College");
		obj2.show();
		Static obj3=new Static();
		obj3.getInput(30,"Adity","MGM College");
		obj3.show();
	}
}