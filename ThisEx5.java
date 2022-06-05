package This;
class ThisEx5
{
	int r=20;
	void display(ThisEx5 t)
	{
		int r=10;
		System.out.println("Instance variable="+t.r);
		System.out.println("Local variable="+r);
	}
	public static void main(String args[])
	{
		ThisEx5 v=new ThisEx5();
	    v.display(v);
	}
}