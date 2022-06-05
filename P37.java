class A
{
	int q=9;
	System.out.println(q);
}
class B extends A
{
	int i,k,z;
	public void B1(int p,int r,int s)
	{
		i=p;
		k=r;
		z=s;
	
	System.out.println(i);
	System.out.println(k);
	System.out.println(s);
	}
}
class P37
{
	public static void main(String args[])
	{
		B obj=new B();
		B1.obj(11,22,33);
	}
	
}