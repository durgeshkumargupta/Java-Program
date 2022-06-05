import java.util.*;
class P174
{
	public static void main(String arsg[])
	{
		String s="S112";
	    int t=Integer.valueOf(s.substring(1,4));
		t++;
		String sc="S"+t;
		String p=Character.valueOf(t);
		int ln=sc.length();  
		System.out.println(t+"  "+sc+"  "+ln);
		
	}
}