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
	MCA(int i)
	{
		System.out.println("value of i="+i);
	}
	
}
class Super6 extends MCA
{
	Super6()
	{
		super(10);
		System.out.println("I'm Super6 class");
	}
	
	public static void main(String args[])
	{
		new Super6();
	}
}
		