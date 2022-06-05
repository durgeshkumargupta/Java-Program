interface I
{
	static void m1()
	{
		System.out.println("Static method m1() of interface");
	}
}
class InterfaceExample3 implements I
{
	public static void m1()
	{
		System.out.println("Hello");
	}
	public static void main(String[] arr)
	{
		I.m1();
		I obj1=new InterfaceExample3();
		m1();
//		obj1.m1();  Error
        InterfaceExample3.m1();
 
		
		
		
		
	}
}