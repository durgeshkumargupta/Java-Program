interface S1
{
    abstract void draw();
}
class Circle implements S1
{
	public void draw()
	{
		System.out.println("Circle draw");
	}
}
class Rec implements S1
{
	public void draw()
	{
		System.out.println("Rec draw");
	}
}
class P123
{
	public static void main(String args[])
	{
		S1 v=new Rec();
		v.draw();
	}
}