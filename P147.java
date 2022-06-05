class P147 extends Thread
{
	public void run2()
	{
		System.out.println("I am Thread");
	}
	public static void main(String args[])
	{
		P147 t=new P147();
	//	t.start();
		t.run2();
	}
}