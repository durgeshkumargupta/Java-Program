class Overriding
{
	void Display(int i,int j)
	{
		System.out.println("Sum of two Number="+(i+j));
	}
	void Display(int i,int j,int k)
	{
		System.out.println("Sum of three Number="+(i+j+k));
	}
	public static void main(String args[])
	{
		Overriding ob=new Overriding();
		ob.Display(10,20,30);
		ob.Display(10,20);
	}
}
		