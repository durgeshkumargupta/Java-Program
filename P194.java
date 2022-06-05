class P194
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.m1();
	}
}
class Demo
{
	strictfp void m1()
	{
		double d1=10.0/3;
		System.out.print(d1);
	}
}
	
	//o/p=3.3333333333333335
	/* Q:Why are you use strictfp keywords
	  Answer:Because all computer/device give same value if i'm not strictfp
	  keywords then 64 bit computer/device different value and 32 bits 
	  computer/device device different value.
	  