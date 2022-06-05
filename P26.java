/* Find even number 1 to 100 */
import java.util.*;
class P26
{
	public static void main(String []args)
	{
		int i,limit,num;
		Scanner v=new Scanner(System.in);
		System.out.print("Enter number=");
		limit=v.nextInt();
		for(i=2;i<=limit;i=i+2)
		{
			//if(i%2==0)
			System.out.print(" "+i);
		}
	}
}
		