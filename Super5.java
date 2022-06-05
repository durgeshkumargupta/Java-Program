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
class Super5 extends BCA
{
	Super5()
	{
		System.out.println("I'm Super5 class");
	}
	
	public static void main(String args[])
	{
		new Super5();
	}
}
		