class P160 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String ars[])
	{
	     P160 t1=new P160();
		 P160 t2=new P160();
		 P160 t3=new P160();
		 Thread s1=new Thread(t1);
		 Thread s2=new Thread(t2);
		 Thread s3=new Thread(t3);
		
		s1.setName("one");
	    s2.setName("Two");
		s3.setName("three");
		System.out.println(Thread.currentThread().getName());//main
		s1.start();
		s2.start();
	    s3.start();
	}
}