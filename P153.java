class P153 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String arr[])
	{
		P153 t1=new P153();
	    P153 t2=new P153();
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
	}
}