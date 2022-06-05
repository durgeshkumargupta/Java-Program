import java.io.IOException;
class P138
{
	void m() throws IOException
	{
		throw new IOException("Link Faild");
	}
	void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			n();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
		
	public static void main(String args[])
	{
	     P138 obj=new P138();
		 obj.p();
         System.out.println("Rest of the Code");
		 
	}
}
	