import java.io.*;
class P142
{
	void m() throws IOException
	{
		throw new IOException("Fail");
	}
	void p() throws IOException
	{
		m();
	}
	void n() throws IOException
	{
		
		p();
		
	}
	public static void main(String arsg[])
	{
		P142 v=new P142();
		try{
		v.n();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Statement 1");
		
	}
}
