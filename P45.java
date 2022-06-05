/* Example of Direct method */
class P45
{
	int roll;
	String name;
	public static void main(String []agrs)
	{
		P45 obj=new P45();
		System.out.println("Name="+obj.name);
		System.out.println("Roll="+obj.roll);
		obj.roll=21;
		obj.name="Durgesh";
		System.out.println("Name="+obj.name);
		System.out.println("Roll="+obj.roll);
	}
}
