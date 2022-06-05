 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Durgesh
 */
/*public class SampleDb4 {
    
}
*/import java.sql.*;
class SampleDb4
{
	public static void main(String args[])
	{
		Connection conn=null;
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		    System.out.println(conn);
		    Statement s=conn.createStatement();
			System.out.println("Connection Succesfully");
			//update value
		 //   s.executeUpdate("insert into user values(9,'manish@gmail.com')");
			//insert value
		    int i=s.executeUpdate("insert into employee(id,name,pin,address) values(10,'Aman',850066,'Bhagalpur')");
		   
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

