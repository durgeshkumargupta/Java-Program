class Static 
{
	static int count=0;
	void show()
	{
		count++;
		System.out.println("Count="+count);
	}
	
}
class P209
{
	public static void main(String args[])
	{
		Static obj1=new Static();
		obj1.show();
		Static obj2=new Static();
		obj2.show();
		Static obj3=new Static();
		obj3.show();
	}
}