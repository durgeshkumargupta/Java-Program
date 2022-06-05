class P149 implements Runnable 
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			
			try{
			Thread.sleep(300);
			}catch(InterruptedException e){}
			System.out.println(i);
		}
	}
    public static void main(String args[])
	{
		P149 t=new P149();
		Thread obj1=new Thread(t);
		Thread obj2=new Thread(t);
		obj1.start();
		obj2.start();
		//obj1.start();
	}
}