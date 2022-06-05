interface I1
{
	void show1(int id,String name);
}
interface I2
{
	void show2(int id,String Address);
}
class Anonymous6
{
	public static void main(String args[])
	{
		new I1(){
			@Override
			public void show1(int id,String name)
			{
				System.out.println("Id= "+id+" Name= "+name);
			}
		}.show1(21,"Rakesh");
		
		new I2(){
			public void show2(int id,String address)
			{
				System.out.println("Id= "+id+" Address= "+address);
			}
				
		}.show2(21,"BGP");
    }
	
}