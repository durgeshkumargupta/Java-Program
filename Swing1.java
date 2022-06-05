import javax.swing.*;
public class Swing1 extends JFrame
{
	//public Swing1(){}
	public Swing1(String s)
	{
		super(s);
	}
	public static void main(String args[])
	{
		Swing1 v=new Swing1("Example Swing");
	    v.setSize(300,300);
		v.setVisible(true);
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}