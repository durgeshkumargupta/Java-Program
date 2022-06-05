package college;
class BCA
{
	int i;
}
class MCA extends BCA
{
	int i;
}
class Super2 extends MCA
{
	//int i;
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
		