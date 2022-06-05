interface I
{
	default void m1()
	{
		System.out.println("default method m1() of interface");
	}
}
class InterfaceExample4 implements I
{

	public static void main(String[] arr)
	{
	
//	m1();    Error
//    I.m1();    Error
//////////////////////////////////////////////////////
      I obj1=new InterfaceExample4();
	  obj1.m1();

		
	}
}