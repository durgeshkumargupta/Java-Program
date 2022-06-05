class Pattern
{
	int i;
	int j;
	int k;
	int z;
	int m;
	void show()
	{
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=(2*i)-1;k++)
			{	System.out.print("*");
			}
			System.out.println();
		}
		for(m=1;m<=5;m++)
		{
		    for(z=1;z<=10;z++)
			{
			    if(z==1| z==5| z==6| z==7)
				System.out.print(" ");
			    else
			    {
					System.out.print("*");
			    }
			
		    }
			System.out.println();
		}
				
	}
		
}
class P211
{
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		p.show();
	}
}