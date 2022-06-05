class Student
{
	String name="Durgesh";
	int age=22;
	public void show()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
}
class Show2
{
	String name="Prince";
	int age=22;
	Student s=new Student(){
		public void show()
		{
			System.out.println("Name="+name+" Age="+age);
		}
			
	};
}
		
class Anonymous1
{
	public static void main(String args[])
	{
		Show2 s2=new Show2();
		s2.s.show();
	}
}