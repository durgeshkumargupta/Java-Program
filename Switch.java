import java.util.*;
class Switch
{
	public static void main(String[]args)
	{
		int i,ch;
		System.out.println("1.kitkat");
		System.out.println("2.Blackbary");
		System.out.println("3.park");
		System.out.println("4.Munch");
		System.out.println("Enter choice=");
        Scanner v=new Scanner(System.in);
		ch=v.nextInt();
		switch(ch)
		{
			case 1:
			 System.out.println("kitkat");break;
			case 2:
			  System.out.println("Blackbary");break;
			case 3:
			   System.out.println("park");break;
			case 4:
			   System.out.println("Munch");break;
			   default:
			   System.out.print("Plz try again");
		}
	}
}
		