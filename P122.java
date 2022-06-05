abstract class S1
{
    abstract void draw();
}
class Circle extends S1
{
	void draw()
	{
		System.out.println("Circle draw");
	}
}
class Rec extends S1
{
	void draw()
	{
		System.out.println("Rec draw");
	}
}
class P122
{
	public static void main(String args[])
	{
		S1 v=new Rec();
		v.draw();
	}
}