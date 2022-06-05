interface I
{
	private void m1()
	{
		System.out.println("default method m1() of interface");
	}
}
class InterfaceExample6 implements I
{
	public void m1()
	{
		System.out.println("default method m1() of InterfaceExample6");
	}

	public static void main(String[] arr)
	{
	
//	m1();     Error
//    I.m1();    Error 
//////////////////////////////////////////////////////
      I obj1=new InterfaceExample6();
	//obj1.m1();   Error
	  InterfaceExample6 obj2=new InterfaceExample6();
	  obj2.m1();

		
	}
}