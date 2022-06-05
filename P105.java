import java.util.Scanner;
class P105
{
	float sum,per,sub1,sub2,sub3;
	String name;
	int roll;

	void getinput(String name,int roll,float sub1,float sub2,float sub3)
	{
		this.roll=roll;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	void display()
	{
		sum=sub1+sub2+sub3;
		per=sum/3;
		System.out.println("Name="+name);
		System.out.println("Roll="+roll);
		System.out.println("Math="+sub1+" Physics="+sub2+" Boilogy="+sub3);
		System.out.println("Total number of Marks="+sum);
		System.out.println("Percentage="+per);
	}
	public static void main(String arsg[])
	{
		Scanner sc=new Scanner(System.in);
		 	int roll[]=new int[3];
	 	String name[]=new String[3];
		int i;
	float sum[]=new float[3];
	float sub1[]=new float[3];
	float sub2[]=new float[3];
	float sub3[]=new float[3];
	float per[]=new float[3];
	
	
		P105 t1=new P105();
		P105 t2=new P105();
		P105 t3=new P105();
		
		for(i=0;i<3;i++)
		{
			System.out.println("Enter Name=");
			name[i]=sc.next();
			System.out.println("Enter Roll=");
			roll[i]=sc.nextInt();
			System.out.println("Enter three subject marks=");
			sub1[i]=sc.nextFloat();
			sub2[i]=sc.nextFloat();
			sub3[i]=sc.nextFloat();
		}
		
		t1.getinput(name[0],roll[0],sub1[0],sub2[0],sub3[0]);
		t2.getinput(name[1],roll[1],sub1[1],sub2[1],sub3[1]);
		t3.getinput(name[2],roll[2],sub1[2],sub2[2],sub3[2]);
		
		 t1.display();
		 t2.display();
		 t3.display();
		 
	}
}