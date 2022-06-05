class P163 implements Runnable
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
			System.out.println("Daemon Thread");
		else
		System.out.println("Not Daemon Thread");
	}
	public static void main(String rag[])
	{
		Thread t1=new Thread(new P163());
		Thread t2=new Thread(new P163());
		Thread t3=new Thread(new P163());
		t1.setDaemon(true);
		
	
		t1.start();
		t2.start();
	    t3.start();
		
	}
}