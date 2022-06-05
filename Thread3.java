class Show implements Runnable
{
	public void run()
	{
		System.out.println("I am Thread Of show method");
	}
}
class Thread3
{
	public static void main(String args[])
	{
		System.out.println("Main class");
	//	Show r=new Show();
		Thread t=new Thread((new Show()));
		t.start();
		
	}
}