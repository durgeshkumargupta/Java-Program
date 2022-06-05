interface I1
{
	void message(int x,int y);
}
class LambdaExample11
{
	public static void main(String args[])
	{
		I1 obj=(a,b)->System.out.println("Value of A="+a+"\n"+"value of B="+b);
		//I1 obj=a,b->System.out.println("Value of A="+a+"\n"+"value of B="+b);  //if value will be more than one then you can use small braces()
		obj.message(11,22);
	}
}
