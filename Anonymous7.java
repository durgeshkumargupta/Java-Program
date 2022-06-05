interface I1
{
	void show1(int id,String name);
}
interface I2 extends I1
{
	void show1(int id,String Address);
}
class Anonymous7
{
	public static void main(String args[])
	{
		new I1(){
			@Override
			public void show1(int id,String name)
			{
				System.out.println("Id= "+id+" Name= "+name);
			}
		}.show1(21,"Adity");
		
		new I2(){
			public void show2(int id,String address)
			{
				System.out.println("Id= "+id+" Address= "+address);
			}
				
		}.show2(21,"PNBE");
    }
	
}

/*  O/P:abstract and does not override abstract method show1

Because interface can not be extends another interface in case of Anonymous  class
and any interface only one method declear in case of Anonymouse class and Lambda Expression
other error
*/