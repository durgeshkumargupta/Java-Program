import java.io.IOException;
class P140
{
	void m()
	{
		try{
		throw new IOException("Link Faild");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void n()
	{
		m();
	}
	void p()
	{
		
			n();
		
	}
		
	public static void main(String args[])
	{
	     P140 obj=new P140();
		 obj.p();
         System.out.println("Rest of the Code");
		 
	}
}
	