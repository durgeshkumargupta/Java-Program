import java.util.*;
class Box
{
	private int lenght,breath,height;
	public void setdata(int l,int b,int h)
	{
		lenght=l;breath=b;height=h;
	}
	public void showdata()
	{
		System.out.println("Lenght="+lenght);
		System.out.println("Breath="+breath);
		System.out.println("height="+height);
	}
}
class P5
{
	public static void main(String[] args)
	{
		int l,b,h;
		Scanner v=new Scanner(System.in);
		l=n.nextInt();
		b=n.nextInt();
		h=n.nextInt();
		
		Box p=new Box();
		p.Setdata(l,b,h);
		p.showdata();
	}
}
		