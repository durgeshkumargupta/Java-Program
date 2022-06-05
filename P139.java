class P139
{
	void m() 
	{
		
		int i=20/0;
		
	}
	void n()
	{
		try{
			
		m();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
    void p()
	{
		n();
		
	}
		
	public static void main(String args[])
	{
		P139 obj=new P139();
	    obj.p();
		System.out.println("Statement 2");
		
	}
}
