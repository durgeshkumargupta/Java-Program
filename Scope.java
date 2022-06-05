class Scope
{
	public static void main(String[] args)
	{
		int x;
		x=10;
		if(x==10)
		{
			int y=10;
			System.out.println("x and y:" +x+" "+y);
			x=y*2;
		}
		double y=100;
		System.out.println("x="+x);
	}
}