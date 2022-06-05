package college;
/*class BCA
{
	int i;
//	System.out.println(i);
}
*/class MCA
{
	int i;
//	System.out.println(i);
}
class Super4 extends MCA
{
	
	void display()
	{
		int i;
		this.i=202;
	super.i=101;
	
	System.out.println(i);
	}
	public static void main(String args[])
	{
		Super4 d=new Super4();
	    d.display();
	}
}
		