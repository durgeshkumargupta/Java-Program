class I1
{
	void show(int roll,String name){};
}
class Sample extends I1
{
	I1 obj1=new I1(){
		public void show(int roll,String name)
		{
			System.out.println("Name= "+name+" Roll= "+roll);
		}
	};
}
class Anonymous10
{
	public static void main(String args[])
	{
		Sample obj2=new Sample();
		obj2.obj1.show(55,"Sonu");
	}
}