/* Find Area of triangle **/
import java.util.*;
class box
{
	int area;
	private int lenght,breath,height;
	public void setdata(int l,int b,int h)
	{
		lenght=l;breath=b;height=h;
	}
	public void showdata()
	{
		System.out.println("lenght="+lenght);
		System.out.println("Breath="+breath);
		System.out.println("Height="+height);
	}
	public void setarea()
	{
		area=2*(lenght*breath*height);
	    System.out.print("Trangle of area="+area);
	}
	
}
class P4
{
	public static void main(String[] args)
	{
		int l,b,h;
		box v=new box();
		Scanner p=new Scanner(System.in);
		System.out.println("Enter Lenght=");
		l=p.nextInt();
		System.out.println("Enter Breath=");
		 b=p.nextInt();
		System.out.println("Enter Height=");
		h=p.nextInt();
		v.setdata(l,b,h);
		v.showdata();
		v.setarea();

	}
}