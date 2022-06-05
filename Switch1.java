import java.util.*;
class Switch1
{
	public static void main(String[]agrs)
	{
		int ch;
		System.out.println("1.Apple");
		System.out.println("2.Blackbary");
		System.out.println("3.Orange");
		System.out.println("4.Graps");
		System.out.println("5.Pineapple");
		System.out.print("Enter your choice=");
		Scanner v=new Scanner(System.in);
		ch=v.nextInt();
		switch(ch)
		{
			case 1:System.out.println("Apple");break;
			case 2:System.out.println("Blackbary");break;
			case 3:System.out.println("Orange");break;
			case 4:System.out.println("Graps");break;
			case 5:System.out.println("pineapple");break;
			default:System.out.println("Invalid input plz try again");break;
		}
	}
}