import java.util.Scanner;
class P109
{
	String name;
	float per,sum,sub1,sub2,sub3;
	int roll;
	void getinput(String name,int roll,float sub1,float sub2,float sub3)
	{
		this.name=name;
		this.roll=roll;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	void display()
	{
		sum=sub1+sub2+sub3;
		per=sum/3;
		System.out.println("NAME="+name);
		System.out.println("ROLL="+roll);
		System.out.println("MATH\tPHY\tCHE\ttoltal\tpercetage");
		System.out.println(sub1+"\t"+sub2+"\t"+sub3+"\t"+sum+"\t"+per);
	}
	public static void main(String ars[])
	{
		Scanner sc=new Scanner(System.in);
		
		P109 t1=new P109();
		P109 t2=new P109();
		P109 t3=new P109();
		String name[]=new String[3];
	   float sub1[]=new float[3];
	    float sub2[]=new float[3];
		 float sub3[]=new float[3];
	  int roll[]=new int[3];
	   for(int i=0;i<3;i++)
	   {
		   System.out.println("Enter name=");
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
		