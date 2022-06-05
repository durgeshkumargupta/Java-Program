import java.util.*;
class P8
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
		System.out.println("Height="+height);
	}
	public void farea()
	{
		int area;
		area=2*(lenght*breath*height);
		System.out.println(+area);
	}
	public static void main(String[] args)
	{
		int l,b,h;
		Scanner v=new Scanner(System.in);
		System.out.println("Enter lenght=");
		l=v.nextInt();
		System.out.println("Enter breath=");
		b=v.nextInt();
		System.out.println("Enetr height=");
		h=v.nextInt();
		P8 p=new P8();
		p.setdata(l,b,h);
		p.showdata();
		p.farea();
	}
}
		