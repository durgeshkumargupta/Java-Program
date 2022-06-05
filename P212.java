class Pattern
{
	int i;
	int j;
	int k;
	int z;
	void show()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=9;k>=(2*i)-1;k--)
			{	System.out.print("*");
			}
			System.out.println();
		}
	/*	for(z=1;z<=10;z++)
		{
			if(z==1| z==5| z==6| z==7)
				System.out.print("");
			else
			{
					System.out.print("*");
			}
			System.out.println();
		}
		*/		
	}
		
}
class P212
{
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		p.show();
	}
}