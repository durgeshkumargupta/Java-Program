class Show implements Runnable
{
	public void run()
	{
		System.out.println("I am Thread");
	}
}
class Thread2
{
	public static void main(String args[])
	{
		Show s=new Show();
		Thread t=new Thread(s);
		t.start();
		System.out.println("Main Class");
	}
}