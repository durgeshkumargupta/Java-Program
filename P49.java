/* Example of thought construct */
class P49
{
	int roll;
	String name;
	void P49(int n,String s)
	{
		roll=n;
		name=s;
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
	}
    public static void main( []agrs)
	{
		P49 v=new P49();
		v.P49(33,"Adity");
		v.display();
	}
}
	
	