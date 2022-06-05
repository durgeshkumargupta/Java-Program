interface I
{
	static void m1()
	{
		System.out.println("Static method m1() of interface");
	}
}
class InterfaceExample2 implements I
{
	public static void main(String[] arr)
	{
		//  m1();  Error
		I.m1();
	/////////////////////////////////////////////////////////
	    InterfaceExample2 obj=new InterfaceExample2();
	//	obj.m1();
		
		
	}
}