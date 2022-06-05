package Static;
class StaticEx5
{ 
   static int rollno;
	StaticEx5()
	{
		System.out.println("Default constructor");
	}
	static void show()
	{  rollno=112;
		System.out.println("Show function");
	}
	static 
	{
		System.out.println("Static Block");
	}
	public static void main(String args[])
	{
		StaticEx5 t=new StaticEx5();
	    t.show();
	}
}
