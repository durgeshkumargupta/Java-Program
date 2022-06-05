class P155 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String arr[])
	{
		P155 t1=new P155();
	    P155 t2=new P155();
		t2.setPriority(9);
		t1.setPriority(1);
		t1.start();
		t2.start();
	}
}