class P161 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String rag[])
	{
		Thread t1=new Thread(new P161());
		Thread t2=new Thread(new P161());
		Thread t3=new Thread(new P161());
		t1.setPriority(1);
		t3.setPriority(10);
		
		t1.setName("one");
	    t2.setName("Two");
		t3.setName("three");
		t1.start();
		t2.start();
	    t3.start();
		
	}
}