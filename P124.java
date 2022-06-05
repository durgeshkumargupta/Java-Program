class Circle
{
	static void draw()
	{
		System.out.println("Circle draw");
	}
}
class Rec extends Circle
{
	static void draw()
	{
		System.out.println("Rec draw");
	}
}
class P124
{
	public static void main(String args[])
	{
	   Circle v=new Rec();
		v.draw();
	}
}