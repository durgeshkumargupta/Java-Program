import java.util.Scanner;
class P104
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
		float sub1,sub2,sub3;
	String name;
	int roll;
		P104 t1=new P104();
		P104 t2=new P104();
		P104 t3=new P104();
		System.out.println("Enter name,ROLL,MATH,PHY,CHE=");
		t1.name=sc.next();
		t1.roll=sc.nextInt();
		t1.sub1=sc.nextFloat();
		t1.sub2=sc.nextFloat();
		t1.sub3=sc.nextFloat();
		System.out.println("Enter name,ROLL,MATH,PHY,CHE=");
		t2.name=sc.next();
		t2.roll=sc.nextInt();
		t2.sub1=sc.nextFloat();
		t2.sub2=sc.nextFloat();
		t2.sub3=sc.nextFloat();
		System.out.println("Enter name,ROLL,MATH,PHY,CHE=");
		t3.name=sc.next();
		t3.roll=sc.nextInt();
		t3.sub1=sc.nextFloat();
		t3.sub2=sc.nextFloat();
		t3.sub3=sc.nextFloat();
		
	     t1.display();
		 t2.display();
		 t3.display();
		 
	}
}