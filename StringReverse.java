class StringReverse
{
	public static void main(String args[])
	{
		String s="Durgesh kumar";
		int len=s.length();
		String s2="";
		System.out.println(s);
		for(int i=(len-1);i>=0;i--)
			s2=s2+s.charAt(i);
		System.out.println(s2);
	}
}
	