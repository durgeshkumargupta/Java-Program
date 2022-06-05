class AnonymousThreadExample6
{
	public static void main(String args[])
	{
		Runnable r=new Runnable(){
			public void run()
			{
				System.out.println("Threading");
			}
		};
		Thread t=new Thread(r);
		t.start();
		System.out.println("Main");
	}
}