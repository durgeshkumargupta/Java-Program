class AnonymousThreadExample5
{
	public static void main(String args[])
	{
		new Thread(new Runnable(){
			public void run()
			{
				System.out.println("Thread 1");
			}
		}).start();
		System.out.println("Main class");
	}
}