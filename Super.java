package college;
class BCA
{
	int i=22;
}
class MCA extends BCA
{
	int i=33;
}
class Super extends MCA
{
	int i=55;
	 void display()
	{
		System.out.println(i);
		System.out.println(super.i);
		
	}
	public static void main(String args[])
	{
		Super d=new Super();
	    d.display();
	}
}
		