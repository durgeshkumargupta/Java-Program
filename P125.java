class Person
{
	static String name="Mr kumar",address="Bihar",ph_no="66665445",email="asds@gmail.com";
	 
}
class Student extends Person
{
	Student() //constructor
	{
	System.out.println("freshman");
	System.out.println("sophomore");
	System.out.println("junior");
	System.out.println("senior");
	}
}
class Employee extends Person
{
   
	double salary=33363.33;
	void Employee()
	{
	     
        System.out.println(salary);
		System.out.println("D_O_H:11:12:2019");
		
	}
}
class Staff extends Employee
{
	Staff()//constructor
	{
		System.out.println("MR kumar Staff");
	}
}
class Faculity extends Employee
{
	Faculity()  //constructor
	{
	System.out.println("TA"+" "+"DA"+" "+"HRA");
	}
}
class P125 extends Faculity
{
	 public String toString() //override the toString()
	{
		return (name+"\n"+address+"\n"+ph_no+"\n"+email);
	}
	public static void main(String args[])
	{
		Person p1=new Person();
	    Staff s2=new Staff();
		Student s1=new Student();
		Faculity f1=new Faculity();
		Employee e1=new Employee();
		P125 f2=new P125();
		System.out.println(f1);//compiler writes here s1.toString()
		System.out.println(f2);//compiler writes here s1.toString()
		System.out.println(s1);//compiler writes here s1.toString() 
	}
	
}