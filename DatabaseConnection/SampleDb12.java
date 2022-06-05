import java.sql.*;
//Connction xampp server in mysql
class SampleDb12
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
			Statement s=conn.createStatement();
			int i=s.executeUpdate("insert into employee values('Aman Kumar',853204,'Dhobazza',4)");
			if(i>0)
				System.out.println("inserted data");
			else
				System.out.println("Not insert data");
			
			ResultSet rs=s.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
			}
			conn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
	
}
		
		