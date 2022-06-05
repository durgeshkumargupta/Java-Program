class P100
{
	float sum,per,sub1,sub2,sub3;
	String name;
	int roll;
	void getinput(int name,int roll,float sub1,float sub2,float sub3)
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
		System.out.println("Name="+=name);
		System.out.println("Roll="+roll);
		System.out.println("Math="+sub1+" Physics="+sub2+" Boilogy="+sub3);
		System.out.println("Total number of Marks="+sum);
		System.out.println("Percentage="+per);
	}
	public static void main(String arsg[])
	{
		Scanner sc=new Scanner(System.in);
		int roll=new int[3];
	   String name=new String[3];
		P100 t=new P100();
		float sub1[]=new float[3];
		float sub2[]=new float[3];
		float sub3[]=new float[3];
	//	float sum,per,sub1,sub2,sub3;
	     int i;
		for(i=0;i<=2;i++)
		{
			System.out.println("Enter Name=");
		    name[i]=sc.nextLine();
			System.out.println("Enter Roll=");
			roll[i]=sc.nextInt();
			System.out.println("Enter three subject=");
			sub1[i]=sc.nextFloat();
			sub2[i]=sc.nextFloat();
			sub3[i]=sc.nextFloat();
			t.getinput(name[i],roll[i],sub1,sub2,sub3);
		}
	/*	for(i=0;i<=2;i++)
		{
			t.display();
		}
	*/

	}
}