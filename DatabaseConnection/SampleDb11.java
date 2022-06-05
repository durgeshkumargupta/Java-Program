//Connction xampp server in mysql
import java.sql.*;
class SampleDb11
{
	public static void main(String args[])
	{
		Connection conn=null;
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
		// or	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3325/test_db","root",""); //where test_db is database name
		    System.out.println(conn);
		    Statement s=conn.createStatement();
			System.out.println("Connection Succesfully");
			//update value
		 //   s.executeUpdate("insert into user values(9,'manish@gmail.com')");
			//insert value
		    int i=s.executeUpdate("insert into student(name,roll,address) values('Divesh',56,'BGP')");
			if(i>0)
				System.out.println("Value insert");
			else
				System.out.println("Sorry");
		
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
