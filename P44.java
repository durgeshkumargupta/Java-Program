class P44
{
	int roll;
	String name;
	void input(int r,String n)
	{
		roll=r;
		name=n;
	}
	void get()
	{
		System.out.println(name);
		System.out.println(roll);
    }
    public static void main(String []agrs)
	{
       P44 v=new P44();
       v.input(21,"Durgesh");
       v.get();
    }	
}
		