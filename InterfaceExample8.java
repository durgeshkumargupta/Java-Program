interface I
{
//	  private void m1();   Error: missing method body, or declare abstract
//    default void m2();  Error: missing method body, or declare abstract
//      static void m3();  Error: missing method body, or declare abstract
       void m1();
	   void m2();
     
}
class InterfaceExample8 implements I
{
//	public void m1();   Error:missing method body, or declare abstract
	public void  m1(){};
	public void m2(){};

	public static void main(String[] arr)
	{
		
	}
}