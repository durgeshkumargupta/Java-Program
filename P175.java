import java.util.*;
class P175
{
	public static void main(String arsg[])
	{
		String s="S112";
	    int t=Integer.valueOf(s.substring(1,4));
		char v=s.charAt(0);
		String p=Character.toString(v);
		t++;
		String sid=p+t;
		
		System.out.println(t+"\n"+v+"\n"+sid);
		
		
		
	}
}