class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class P151
{
	public static void main(String rags[])
	{
		Thread t1=new Thread(new A());
		Thread t2=new Thread(new B());
		t1.setName("Vikash");
		t2.setName("Durgesh");
		
	      
          t1.setPriority(Thread.MIN_PRIORITY);
		  t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	
	}
}
