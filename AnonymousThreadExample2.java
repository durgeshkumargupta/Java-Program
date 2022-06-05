//Anonymous Inner class that implements a interface 
class AnonymousThreadExample2
{
	public static void main(String args[])
	{
	     Runnable r=new Runnable(){
			 public void run()
			 {
				 System.out.println("I am Thread");
			 }
		 };
		 Thread t=new Thread(r);
		 t.start();
		 System.out.println("Main Class");
		 
	}
}