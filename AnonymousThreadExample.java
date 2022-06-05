//Java program to illustrate creating an immediate thread 
//Using Anonymous Inner class that extends a Class 
class AnonymousThreadExample
{
	public static void main(String args[])
	{
		Thread t=new Thread(){
			public void run()
			{
				System.out.println("I am Thread Anonymous class");
			}
		};
		t.start();
		System.out.println("I am Main");
	}
}