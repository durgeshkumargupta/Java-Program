class P158 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String rag[])
	{
		Thread t1=new Thread(new P158());
		Thread t2=new Thread(new P158());
		Thread t3=new Thread(new P158());
		t1.start();
		t2.start();
	    t3.start();
		
	}
}