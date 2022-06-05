package This;
class ThisEx3
{
	int roll;
	String name;
	void getinput(int roll,String name)
	{
		this.roll=roll;
		this.name=name;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String args[])
	{
		ThisEx3 v=new ThisEx3();
		v.getinput(22,"Adity");
		v.display();
	}
}
