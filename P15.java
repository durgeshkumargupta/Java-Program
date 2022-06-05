/* Find Fibonacci series */
class P15
{
	public static void main(String[] args)
	{
	   int sum=0,x=0,y=1,i,j,num;
	   for(i=0;i<args.length;i++)
	   {
		   num=Integer.parseInt(args[i]);
		   System.out.print("Fibonacci Series="+x);
		  for(j=1;j<=num;j++)
		  {
			  x=y;
			  y=sum;
			  sum=x+y;
		  System.out.print(" "+sum);
		  }
	   }
	}
}
	   
	
	