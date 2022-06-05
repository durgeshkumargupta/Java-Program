import java.util.*;
class P198
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size=");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter Array Data=");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		ArrayDemo a=new ArrayDemo();
		a.m1(arr);
	}
}
class ArrayDemo
{
	
	void m1(int... arr)
	{
		System.out.println("Array data=");
		for(int i:arr)
			System.out.println(i);
	}
}