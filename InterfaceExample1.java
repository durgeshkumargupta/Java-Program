interface I
{
	void m1();
	void m2();
}
class InterfaceExample1 implements I
{
	public void m1()
	{
		System.out.println("InterfaceExample1 class method M1()");
	}
		public void m2()
	{
		System.out.println("InterfaceExample1 class Method M2()");
	}
	public static void main(String args[])
	{
		InterfaceExample1 obj=new InterfaceExample1();
		obj.m1();
		obj.m2();
		
	  System.out.println("_________________________________________");
	  //  I obj1=new I();   Error
	 // 	obj.m1();
	 
	 
	 I obj2=new InterfaceExample1();
	   obj2.m1();
	   obj2.m2();
		
	}
}