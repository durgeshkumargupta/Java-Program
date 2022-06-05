import java.sql.*;
class SampleDb13
{
	public static void main(String args[])
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db","root","");
			Statement s=conn.createStatement();
			int i=s.executeUpdate("insert into employee values('Sonu',800200,'Bangalore',5)");
			if(i>0)
				System.out.println("Data inserted");
			else
				System.out.println("Data not inserted");
			ResultSet rs=s.executeQuery("select * from employee");
			while(rs.next())
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

	