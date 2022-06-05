class P197
{
	public static void main(String args[])
	{
		int arr[]={11,22,33,44,55};
		ArrayExample a=new ArrayExample();
		a.m1(arr);
		
	}
}
class ArrayExample
{

	void m1(int... arr)
	{
		for(int a:arr)
			System.out.println(a);
	}
}
// O/P:11 22 33 44 55