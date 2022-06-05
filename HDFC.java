package college;
class BANK
{
	void deposit()
	{
		System.out.println("deposit");
	}
	void roi()
	{
		System.out.println("4.2");
	}
	void withdraw()
	{
		System.out.println("withdraw");
	}
}
class AXIS extends BANK
{
	void roi()
	{
		System.out.println("6%");
	}
}
class SBI extends BANK
{
	void neft()
	{
		System.out.println("NEFT");
	}
}
class HDFC extends BANK
{
	void roi()
	{
		System.out.println("6.3%");
	}
	public static void main(String args[])
	{
	/*	AXIS a=new AXIS();
		a.withdraw();
		a.roi();
		a.deposit();
		SBI s=new SBI();
		s.deposit();
		s.withdraw();
		s.roi();
		*/HDFC h=new HDFC();
		h.deposit();
		h.roi();
		h.withdraw();
		BANK h2=new HDFC();
		h2.roi();
	/*	HDFC h3=new BANK();
		h3.roi();
		*/
	}
}
	

	
	