import java.applet.Applet;
import java.awt.*;
/*  <applet code="Myapplet2" width="500" height="400"></applet > */
public class Myapplet2 extends Applet
{
	//Lebel v1,v2;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		v1=new Textbox("First Number");
		v2=new Lebel("Second Number");
		t1=new TextField();
		t2=new TextField();
		b1=new Button("Add");
		add(t1);
		add(t2);
		add(b1);
		add(v1);
		add(v2);
	}
      
	
}