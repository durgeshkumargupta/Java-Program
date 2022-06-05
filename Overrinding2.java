class Overriding2
{
	void Display(char i,char j)
	{
		System.out.println("Sum of two Number="+i+" "+j);
	}
	void Display(int i,int j,int k)
	{
		System.out.println("Sum of three Number="+(i+j+k));
	}
	public static void main(String args[])
	{
		Overriding2 ob=new Overriding2();
		ob.Display(10,20,30);
		ob.Display('A','B');
	}
}
		