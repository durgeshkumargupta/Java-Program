//Anonymous Inner class that defines inside method/constructor argument
class AnonymousThreadExample3
{
	public static void main(String args[])
	{
		Thread t=new Thread(new Runnable(){
			public void run()
			{
				System.out.println("I am Thread of innner class");
			}
		});
		t.start();
		System.out.println(" I am Main class");
	}
}