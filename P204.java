// this keyword using varible name
class P204
{
	public static void main(String args[])
	{
		This obj=new This();
		obj.show(21,"Suraj");
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
	}
}
class This
{
	int roll;
	String name;
	void show(int roll,String name)
	{
		this.name=name;
		this.roll=roll;
	}
    String getName()
	{
		return name;
	}
	int getRoll()
	{
		return roll;
	}
}
		
	
	