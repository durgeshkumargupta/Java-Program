interface I1
{
	void show1();
	void show2();
}
class Example implements I1
{
	public void show1()
	{
		System.out.println("Hello");
	}
	public void show2()
	{
		System.out.println("Hi");
	}
}
class Anonymous5
{
	public static void main(String args[])
	{
		I1 i=new Example();
		i.show1();
		i.show2();
		//Anonymouse function
		new Example(){
		}.show1();
		
		new Example(){
		}.show2();
		
	}
}