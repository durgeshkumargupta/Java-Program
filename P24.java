class P24
{
	private int roll,total,div;
	private String name;
	public void setdata(int r,int t,int d)
	{ roll=r;total=t;div=d;}
	public void showdata()
	{  
	System.out.println("Roll="+roll);
	System.out.println("Total Marks="+total);
	System.out.println("Div="+div);
	}
}

	public static void main(String []agrs)
	{
		P24 x=new P24();
		x.setdata(21,333,1);
		x.showdata();
	}
}
		