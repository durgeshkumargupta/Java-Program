import java.sql.*;
class SampleDb
{
	public static void main(String args[])
	{
		Connection conn=null;
		try
		{
	            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/apex","root","");//where apex is database name
		    System.out.println(conn);
		    Statement s=conn.createStatement();
			System.out.println("Connection Succesfully");
			//update value
		    s.executeUpdate("insert into user values(3,'manish@gmail.com')");
			//insert value
		    int i=s.executeUpdate("insert into user(id,name) values(5,'Sonu')");
		   
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
