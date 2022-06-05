class P145 implements Runnable
{
	public void run()
	{
		System.out.println("I am Thread");
	}
	public static void main(String rag[])
	{
		P145 t1=new P145();
		Thread obj1=new Thread(t1);
		Thread obj2=new Thread(t1);
		Thread obj3=new Thread(t1);
		obj1.start();
		obj2.start();
	//	obj2.start();  unchecked exception
	    obj3.start();
	}
}
