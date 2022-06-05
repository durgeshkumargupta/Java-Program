/* Find factorial value */
class P14
{
	public static void main(String args[])
	{
		int num,i,multi=1,j;
		for(i=0;i<args.length;i++)
		{ 
	         num=Integer.parseInt(args[i]);
			for(j=num;j>=1;j--)
			multi=multi*j;
		}
		System.out.print("Factorial value="+multi);
	}
}
		