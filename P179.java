class P179
{
	private int x;
	{
		System.out.println("Value ox X="+x);
		x=5;
	}
	P179()
	{
		System.out.println("Constructor:x="+x);
	}
	public static void main(String arsg[])
	{
		P179 t=new P179();
		P179 t2=new P179();
    }
}