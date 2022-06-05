interface I
{
	default void m1()
	{
		System.out.println("default method m1() of interface");
	}
}
class InterfaceExample5 implements I
{
	public void m1()
	{
		System.out.println("default method m1() of InterfaceExample5");
	}

	public static void main(String[] arr)
	{
	
//	m1();     Error
//    I.m1();    Error 
//////////////////////////////////////////////////////
      I obj1=new InterfaceExample5();
	  obj1.m1();
	  InterfaceExample5 obj2=new InterfaceExample5();
	  obj2.m1();

		
	}
}