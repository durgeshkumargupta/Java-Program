interface InterfaceClass
{
	 void show();
}
class LambdaExample
{
	public static void main(String args[])
	{
/*		InterfaceClass i=new InterfaceClass(){
			public void show(int b)
			{
				System.out.println("I am Show");
			}
		};
		*/
		InterfaceClass i=()->System.out.println("I am Lembda Example");  //lambda Expression
		i.show();
	}
}
