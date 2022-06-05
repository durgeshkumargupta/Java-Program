/* Example of thought method */
class P46
{
    int roll;
    String name;
	void input()
	{
		roll=21;
		name="Prince";
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
	public static void main(String []agrs)
	{
		P46 v=new P46();
		v.input();
		v.display();
		v.roll=100;
		v.display();
	}
}