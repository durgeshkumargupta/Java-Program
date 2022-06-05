class P162 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String rag[])
	{
		Thread t1=new Thread(new P162());
		Thread t2=new Thread(new P162());
		Thread t3=new Thread(new P162());
		t1.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.setName("one");
	    t2.setName("Two");
		t3.setName("three");
		t1.start();
		t2.start();
	    t3.start();
		
	}
}