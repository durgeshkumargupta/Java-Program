class P143 extends Thread
{
	public void run()
	{
		System.out.println("I am Thread");
	}
	public static void main(String args[])
	{
		P143 t=new P143();
		t.start();
		
	}
}
