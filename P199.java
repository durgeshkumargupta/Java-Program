interface I
{
	static void show()
	{
		System.out.println("Hello Interface");
	}
}
class P199
{
	public static void main(String arsg[])
	{
	//error	I i=new I();
		I.show();
	}
}