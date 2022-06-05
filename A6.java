class A6
{
	public static void main(String[] args)
	{
		int a,i,j;
		for(i=1;i<=6;i++)
		{
			for(j=i;j>=1;j--)
			{
				
				if(i%3==0)
				{
					a=0;
					System.out.print(+a);
				}
				else if(i%2==0)
				{
					a=2;
					System.out.print(+a);
				}
				else if(i%2!=0)
				{
					a=1;
					System.out.print(+a);
				}
			}
			System.out.println();
		}
	}
}