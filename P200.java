interface I
{
	
	default void show()
	{
		System.out.println("Interface I");
	}
}
interface J
{
	default void show()
	{
		System.out.println("Interface J");
	}
}
class A
{
	public void show()
	{
		System.out.println("class A");
	}
}
class P200 extends A implements I 
{
	public static void main(String arsg[])
	{
		P200 obj=new P200();
		obj.show();
	}
}