interface Drawable
{
	void draw();
}
interface Draggable extends Drawable
{
	void drag();
}
class P126 implements Draggable
{
	public void drag()
	{
		System.out.println("Drag");
	}
	public void draw()
	{
		System.out.println("Draw");
	}
	public static void main(String ars[])
	{
		P126 t=new P126();
	    t.drag();
	    t.draw();
	}
}
	
