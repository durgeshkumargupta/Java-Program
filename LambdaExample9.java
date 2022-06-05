interface I1
{
	void Message();
}
class LambdaExample9
{
	public static void main(String args[])
	{
		I1 obj=()->System.out.println("Hello Lambda");
		obj.Message();
	}
}