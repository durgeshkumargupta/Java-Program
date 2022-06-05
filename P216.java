abstract class I1
{
	abstract void show1();
	abstract void show2();
}
class Example extends I1
{
	void show1()
	{
		System.out.println("Show1()");
	}
	void show2()
	{
		System.out.println("Show2()");
	}
}
class P216
{
		
	public static void main(String args[])
	{
		I1 obj=new Example();
		obj.show1();
		obj.show2();
		
		//Anonomuse Function
		new Example(){
		}.show1();
		new Example(){
		}.show2();
	}
}
		