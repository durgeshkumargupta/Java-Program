package This;
class ThisEx2
{
	String name;
	int roll;
	ThisEx2(int roll,String name)
	{
		this.name=name;
		this.roll=roll;
	}
	void student()
	{
		System.out.println("Name="+this.name+"\nRoll="+this.roll);
		
	}
		
	public static void main(String args[])
	{
		ThisEx2 obj=new ThisEx2(21,"Durgesh");
		obj.student();
	}
}