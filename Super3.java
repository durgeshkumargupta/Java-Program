package college;
class BCA
{
	BCA()
	{
		System.out.println("I'm am BCA class");
	}
}
class MCA extends BCA
{
	MCA()
	{
		System.out.println("I'm am MCA class");
	}
	
}
class Super3 extends MCA
{
	Super3()
	{
		System.out.println("I'm Super3 class");
	}
	
	public static void main(String args[])
	{
		new Super3();
	}
}
		