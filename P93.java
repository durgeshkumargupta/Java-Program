class P93
{
	int x=20;
	void show(P93 d1)
	{
		int x=10;
		System.out.println(x);
		System.out.println(d1.x);
	}
	public static void main(String agrs[])
	{
		P93 d1=new P93();
		d1.show(d1);
		System.out.println(d1);
	}
}