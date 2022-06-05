class P61
{
	public static void main(String []ar1)
	{
		char ar[]={'D','U','R','G','E','S','H'};
		String v1=new String(ar);
		String v2=new String(ar,2,4);
		StringBuffer v3=new StringBuffer("DURGESH");
		System.out.println(v2);
		System.out.println(v1);
		System.out.println(ar);
		System.out.println(ar[4]);
		System.out.println(v1.length());
		System.out.println(v3.capacity());
	
	}
}
	
	