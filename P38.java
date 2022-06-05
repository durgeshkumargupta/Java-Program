package pack14;
class B1
{
	String name;
	double bal;
	
	B1(String n,double b)
	{
		name=n;
		bal=b;
	}
	void show()
	{
		System.out.println(name +": $"+bal);
	}
}
class P38
{
	public static void main(String[] agrs)
	{
		B1 c[]=new B1[3];
		
		c[0]=new B1("K.J.Fielding",123.23);
		c[1]=new B1("K.k.company",1.00);
		c[2]=new B1("S.k.company",555.87);
		
		for(int i=0;i<3;i++)
			c[i].show();
	}
}
