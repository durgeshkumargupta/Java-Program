class P10
{ 
	P10()
	{   
		System.out.print("Constructor-1");
	}
}
Class P11()
{
	P11(int i)
	{
		System.out.print("Cnostructor-2");
	}
	
public static void main(String args[])
{
	P11 b1=new P11(10);
	P10 b2=new P10();
}
}
