interface InterfaceClass
{
	void display();
//	void play(); //we do not declear more the one method (Error)
}
class LambdaExample7
{
	public static void main(String args[])
	{
		InterfaceClass i1=()->System.out.println("I am display method");
		i1.display();
//		InterfaceClass i2=()->System.out.println("I am play method");
//		i2.play();
	}
}