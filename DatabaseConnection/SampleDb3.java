import java.sql.*;
//Connction xampp server in mysql
class SampleDb3
{
	public static void main(String args[])
	{
		Connection conn=null;
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
		// or	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");//where test_db is database name
			
		    System.out.println(conn);
		    Statement s=conn.createStatement();
			System.out.println("Connection Succesfully");
			//update value
		 //   s.executeUpdate("insert into user values(9,'manish@gmail.com')");
			//insert value
		    int i=s.executeUpdate("insert into employee(name,pin,address) values('Ravi',851000,'Patna')");
		   
		  if(i>0)
		  {
			System.out.println("Succesfully update");
		  }
		 else
		  {
			System.out.println("Error");
		  }
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally
		{
			try
			{
				conn.close();
			}
			catch(Exception e)
			{}
		}
	}
}
