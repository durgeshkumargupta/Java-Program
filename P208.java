class Static
{
	int roll;
	String name;
	static String college="MGM College";
	void getInput(int roll,String name)
	{
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
class P208
{
	public static void main(String args[])
	{
		Static obj1=new Static();
		obj1.getInput(21,"Durgesh");
		obj1.show();
		Static obj2=new Static();
		obj2.getInput(26,"Sonu");
		obj2.show();
		Static obj3=new Static();
		obj3.getInput(30,"Adity");
		obj3.show();
	}
}