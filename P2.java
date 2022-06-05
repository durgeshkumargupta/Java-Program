public class P2
{
  public static void main(String args[])
   {
    int s,i;
     i=s=0;
     for(i=0;i<args.length;i++)
      s=s+Integer.parseInt(args[i]);
	System.out.println("sum="+s);
   }
}