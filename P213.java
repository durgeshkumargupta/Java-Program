class Bank
{
	void withdraw()
	{
		System.out.println("Withdraw");
	}
	void deposit()
	{
		System.out.println("Deposit");
	}
	void roi()
	{
		System.out.println("6%");
	}
	
}
class Axis extends Bank
{
	void roi()
	{
		System.out.println("6.9%");
	}
}
class HDFC extends Bank
{
	void interset()
	{
		System.out.println("8.2%");
	}
}
class P213
{
	public static void main(String arsg[])
	{
		Bank h=new HDFC();
		h.withdraw();
	//	h.interset();
		h.deposit();
		Bank a=new Axis();
		a.roi();
		a.withdraw();
	}
}
	
	