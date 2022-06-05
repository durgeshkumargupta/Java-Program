class AnonymousThreadExample4
{
	public static void main(String args[])
	{
		new Thread(){
			public void run()
			{
				System.out.println("Thread 1");
			}
		}.start();
		System.out.println("Main class");
	}
}
		