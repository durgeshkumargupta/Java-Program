class Show extends Thread
{
	public void run()
	{
		System.out.println(" I am Thread Example");
	}
}
class Thread1
{
	public static void main(String args[])
	{
		Show t=new Show();
		t.start();
		System.out.println(" I am Main()");
		
	}
}
	