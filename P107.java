class P107
{
	public static void main(String args[])
	{
		new P107();
		new P107(10);
		new P107(20,30);
		System.out.println("this is main");
	}
	P107()
	{
		System.out.println("default constructor");
	}
	P107(int x)
	{
		System.out.println(x);
	}
	P107(int x,int y)
	{
		System.out.println(x+"  "+y);
	}
	{
		System.out.println("init block1");
	}
	{
		System.out.println("Init block2");
	}
	static 
	{
		new P107();
		new P107(40,60);
	    new	P107(50);
	}
	static
	{
		new P107(100,200);
		System.out.println("this is static block");
	}
	{
		System.out.println("init block3");
	}
}
