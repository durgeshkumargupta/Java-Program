class P112
{
	int roll;
	String name;
	P112(int roll,String name)
	{
		roll=roll;
		name=name;
	
	}
	void show()
	{
		System.out.println("Roll="+roll);
		System.out.println("Name="+name);
	}
	public static void main(String args[])
	{
		P112 t=new P112(21,"Dugresh");
		t.show();
	}
}
		