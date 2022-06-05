class P144 extends Thread
{
	public void run()
	{
		System.out.println("I am Thread");
	}
	public static void main(String args[])
	{
		P144 t1=new P144();
		P144 t2=new P144();
		t1.start();
		t2.start();
	//error	t1.start();
		
	}
}
