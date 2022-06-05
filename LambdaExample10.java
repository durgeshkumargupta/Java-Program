interface I1
{
	void message(int i);
}
class LambdaExample10
{
	public static void main(String args[])
	{
		I1 obj=x->System.out.println("Value of X="+x);
		obj.message(22);
	}
}