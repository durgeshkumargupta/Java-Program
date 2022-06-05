class P157 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String args[])
	{
		P157 t1=new  P157();
		P157 t2=new P157();
		P157 t3=new P157();
		t1.start();
		t2.start();
		t3.start();
		
	}
}