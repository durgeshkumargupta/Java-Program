class P154 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String arr[])
	{
		P154 t1=new P154();
	    P154 t2=new P154();
		
		t1.start();
		t2.start();
	}
}