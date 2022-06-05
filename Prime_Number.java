import java.util.*;
public class Prime_Number
{
     public static void main(String[] args)
	 {
	     int i,count=0,j,num;
		 Scanner n=new Scanner(System.in);
		 System.out.print("Enter Nmuber=");
		 num=n.nextInt();
		 for(j=1;j<=num;j++)
		 {
			 count=0;
		 for(i=1;i<=j/2;i++)
		 {
			   if(j%i==0)
			    count++;
		 }
			if(count==1)
	          System.out.print(j+", ");
		 }
	 }
}
		 
		 