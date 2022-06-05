interface Drawable
{
	void draw();
}
interface Draggable extends Drawable
{
	void drag();
}
class P128 implements Draggable
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
		Drawable t=new P128();
	// error    t.drag();
		t.draw();
	}
}
	
