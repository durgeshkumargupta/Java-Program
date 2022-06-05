// this keyword using varible name
class P205
{
	public static void main(String args[])
	{
		This obj=new This(21,"Durgesh");
		This obj2=new This();
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
	}
}
class This
{
	int roll;
	String name;
	This()
	{}
	This(int roll,String name)
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
		
	
	