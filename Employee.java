/*Example of Compostion */
class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Employee
{
	String name;
	int age;
	public static void main(String args[])
	{
		new Address("BGP","BR","INDIA");
	}
}

