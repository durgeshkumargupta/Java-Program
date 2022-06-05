import java.util.Scanner;
class P69
{
	String name;
	int roll;
	P69()
	{
      name="Ravi";
	  roll=55;
	}
	void display()
	{
				System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String []aa)
	{
		P69 v=new P69();
		v.display();
	}
}