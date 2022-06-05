class Car
{
	private String brand;
	private int cost;
	private String color;
	public void setData(String brand,String color,int cost)
	{
		if((brand!=null) && (color!=null) && (cost>0))
		{
			this.brand=brand;
			this.cost=cost;
			this.color=color;
		}
		else
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
	}
		public int getCost()
		{
			return cost;
		}
		public String getBrand()
		{
			return brand;
		}
		public String getColor()
		{
			return color;
		}
}
	
class P218
{
	public static void main(String args[])
	{
		Car c=new Car();
		c.setData("BMW","White",200000000);
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getCost());
		
		c.setData("BMW","",200000000);
		System.out.println(c.getBrand());
		System.out.println(c.getColor());
		System.out.println(c.getCost());
		
	}
}