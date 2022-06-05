import java.util.Scanner;
class P103
{
	
	 	int roll[]=new int[3];
	 	String nm[]=new String[3];
	 	int i;
	float sum[]=new float[3];
	float sub1[]=new float[3];
	float sub2[]=new float[3];
	float sub3[]=new float[3];
	float per[]=new float[3];
	
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			System.out.println("Enter Name=");
			nm[i]=sc.next();
			System.out.println("Enter Roll=");
			roll[i]=sc.nextInt();
			System.out.println("Enter three subject marks=");
			sub1[i]=sc.nextFloat();
			sub2[i]=sc.nextFloat();
			sub3[i]=sc.nextFloat();
		}
	}
	void show()
	{
		 System.out.println("Name \t Roll \t Total \t percentage");	
		for(i=0;i<3;i++)
		{ 
	       sum[i]=sub1[i]+sub2[i]+sub3[i];
		   per[i]=sum[i]/3;
           System.out.println(nm[i]+"\t"+roll[i]+"\t"+sum[i]+"\t"+per[i]);		   
		}
	}
	
	public static void main(String args[])
	{
		
		P103 t=new P103();
		t.getinput();
		t.show();
	}
}
