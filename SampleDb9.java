//process
import java.sql.*;
class SampleDb9
{
	public static void main(String args[])
	{
		Connection conn=null;
		try
		{/*//	DriverManager.registerDriver("org.sqlite.JDBC.Driver");
			class.forName("org.sqlite.JDBC.Driver");
		    conn=DriverManager.getConnection("jdbc:mysql:localhost/school","root","root");
		    System.out.println(conn);
		    Statement s=conn.createStatement();
			System.out.println("Connection Succesfully");
			//update value
		 //   s.executeUpdate("insert into user values(9,'manish@gmail.com')");
			//insert value
		    int i=s.executeUpdate("insert into employee(rollno,name,pin,address) values(21,'Komal',851000,'Naugachia')");
		   */
		   	Class.forName("com.mysql.jdbc.Driver");
		// or	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		    System.out.println(conn);
		    Statement s=conn.createStatement();
			
		//	 boolean j=Boolean.parseBoolean("jdbc:mysql://localhost:3306/school","root","root");
        //  System.out.println(j);
			
			System.out.println("Connection Succesfully");
			//update value
		 //   s.executeUpdate("insert into user values(9,'manish@gmail.com')");
			//insert value
		    int i=s.executeUpdate("insert into employee(name,pin,address) values('Ronak',851000,'Patna')");
		   
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
