import java.sql.*;
class SampleDbFetchData
{
	public static void main(String args[])
	{
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Load");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			st=conn.createStatement();
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				Integer roll=rs.getInt(1);
				String name=rs.getString(2);
				String address=rs.getString(3);
				System.out.println("Name:"+name +"Roll:"+roll +"Address:"+address);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			try{
				if(conn==null)
					return;
				conn.close();
				rs.close();
				st.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
	}
}
		