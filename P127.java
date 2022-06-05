interface Draw
{
	void draw();
}
interface Draggable extends Draw
{
	void drag();
}
class P127 implements Draggable
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
		Draggable t=new P127();
	    t.drag();
		t.draw();
	}
}
	
