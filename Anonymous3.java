//Java program to demonstrate Anonymous inner class
interface I
{
	 void show();
}
class Anonymous3
{
	public static void main(String args[])
	{
		I i=new I(){
			public void show()
			{
				System.out.println("I am Interface of Anonymous3 class");
			}
		};
		i.show();
	}
}