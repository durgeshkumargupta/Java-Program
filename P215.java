//Given an array find pairs of element whose sum is equal to n
import java.util.Scanner;

class NumberEnter
{
    void show()
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int number;
        System.out.println("Enter pair of Number=");
        number=sc.nextInt();
        System.out.println("Enter Array element=");
        for (int i=1;i<=10;i++) {
           arr[i]=sc.nextInt();
        }
        for (int j=1;j<=10;j++)
        {
            System.out.println(arr[j]+" ");
        }

    }
}
public class P215 {
    public static void main(String[] args)
    {
        NumberEnter obj=new NumberEnter();
        obj.show();

    }
}
