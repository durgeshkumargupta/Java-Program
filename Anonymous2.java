class Greeting
{
	void sayHello()
	{
		System.out.println("Hello");
	}
	void display()
		{
			System.out.println("I am Display of class Greeting");
		}
}
class India
{
	Greeting g=new Greeting(){
		void sayHello()
		{
			System.out.println("Hi");
		}
		void display()
		{
			System.out.println("I am Display of India");
		}
	};
}	
class Anonymous2
{
	public static void main(String args[])
	{
		India i=new India();
		i.g.sayHello();
		i.g.display();
	}
}