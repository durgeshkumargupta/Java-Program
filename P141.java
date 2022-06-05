//import java.io.*;
class P141 
{
	void m()
	{
		throw new ArithmeticException("Fail");
	}
	void p()
	{
		m();
	}
	void n()
	{
		
		p();
		
	}
	public static void main(String arsg[])
	{
		P141 v=new P141();
		try{
		v.n();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("Statement 1");
		
	}
}
