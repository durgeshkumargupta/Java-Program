import java.util.Scanner;
public class Palindrom_Number2
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("____________check if a given number is palindrome or not_______________________");
        System.out.println("Enter Number=");
        Integer num2=sc.nextInt();
        String str2=palindromeNumberCheck(num2);
        System.out.println(str2);
	}

private static String palindromeNumberCheck(Integer num2)
{
        int temp;
        int rev=0;

        for(int i=num2;i!=0;i/=10){
            temp=i%10;
            rev=rev*10+temp;
        }
        if(rev==num2) {
            System.out.println(rev+" "+num2);
            return "Number is palindrome Number";

        }
        else {
            System.out.println(rev+" "+num2);
            return "Number is not palindrome Number";
        }

 }
}
	
