class P159 implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String ars[])
	{
	     P159 t1=new P159();
		 P159 t2=new P159();
		 P159 t3=new P159();
		 Thread s1=new Thread(t1);
		 Thread s2=new Thread(t2);
		 Thread s3=new Thread(t3);
		
		s1.setName("one");
	    s2.setName("Two");
		s3.setName("three");
		s1.start();
		s2.start();
	    s3.start();
	}
}